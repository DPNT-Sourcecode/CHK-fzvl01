package befaster.solutions.CHK;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CheckoutSolution {

    private static List<MultiBuyOffer> multiBuyOfferList;
    private ShoppingCart shoppingCart = new ShoppingCart();

    static {
        multiBuyOfferList = Arrays.asList(MultiBuyOffer.values());
        multiBuyOfferList.sort(Comparator.comparingInt(MultiBuyOffer::getDiscount));
    }

    public Integer checkout(String skus) {
        if (skus.isEmpty()){
            return 0;
        }

        String[] split = skus.split("");

        try {
            List<Product> productList = Arrays.stream(split).map(Product::valueOf).collect(Collectors.toList());
            productList.forEach(product -> shoppingCart.add(product));

            int total = productList.stream().map(Product::getPrice).reduce(0, Integer::sum);

            for (MultiBuyOffer multiBuyOffer : multiBuyOfferList) {

                while (shoppingCart.get(multiBuyOffer.getRequiredProduct()) >= multiBuyOffer
                        .getRequiredNumber()
                        && shoppingCart.get(multiBuyOffer.getReplacedProduct()) >= multiBuyOffer
                        .getReplacedNumber()) {

                    shoppingCart.remove(multiBuyOffer.getReplacedProduct(), multiBuyOffer.getReplacedNumber());
                    total = total - multiBuyOffer.getDiscount();
                }
            }
            return total;
        } catch (IllegalArgumentException e) {
            return -1;
        }
    }

}




