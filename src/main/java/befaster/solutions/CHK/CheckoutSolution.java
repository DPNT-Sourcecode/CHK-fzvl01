package befaster.solutions.CHK;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CheckoutSolution {

    private static List<MultiBuyOffer> multiBuyOfferList;
    private static List<GroupDiscountOffer> groupDiscountOfferList;
    private ShoppingCart shoppingCart;

    static {
        multiBuyOfferList = Arrays.asList(MultiBuyOffer.values());
        multiBuyOfferList.sort(Comparator.comparingInt(MultiBuyOffer::getDiscount).reversed());
        groupDiscountOfferList = Arrays.asList(GroupDiscountOffer.values());
    }

    public Integer checkout(String skus) {
        if (skus.isEmpty()){
            return 0;
        }

        shoppingCart = new ShoppingCart();

        String[] split = skus.split("");

        try {
            List<Product> productList = Arrays.stream(split).map(Product::valueOf).collect(Collectors.toList());
            productList.forEach(product -> shoppingCart.add(product));

            int total = productList.stream().map(Product::getPrice).reduce(0, Integer::sum);

            for (MultiBuyOffer multiBuyOffer : multiBuyOfferList) {

                while (shoppingCart.contains(multiBuyOffer.getRequiredProducts())) {
                    shoppingCart.remove(multiBuyOffer.getRequiredProducts());
                    total = total - multiBuyOffer.getDiscount();
                }
            }

            for (GroupDiscountOffer groupDiscountOffer : groupDiscountOfferList) {
                while (shoppingCart.containsAtLeast(groupDiscountOffer.getNumberOfProducts(), groupDiscountOffer.getProductList())) {
                    int priceOfRemoved = shoppingCart.removeMostExpensive(groupDiscountOffer.getNumberOfProducts(), groupDiscountOffer.getProductList());
                    total = total - (priceOfRemoved - groupDiscountOffer.getPrice());
                }
            }
            return total;
        } catch (IllegalArgumentException e) {
            return -1;
        }
    }

}



