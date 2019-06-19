package befaster.solutions.CHK;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CheckoutSolution {

    private static List<MultiBuyOffer> multiBuyOfferList = Arrays.asList(MultiBuyOffer.values());

    static {
        multiBuyOfferList.sort(new Comparator<MultiBuyOffer>() {
            @Override
            public int compare(MultiBuyOffer o1, MultiBuyOffer o2) {
                return o1.getDiscount() ;
            }
        });
    }
    public Integer checkout(String skus) {
        if (skus.isEmpty()){
            return 0;
        }

        String[] split = skus.split("");

        try {
            List<Product> productList = Arrays.stream(split).map(Product::valueOf).collect(Collectors.toList());



            int total = productList.stream().map(Product::getPrice).reduce(0, Integer::sum);

            for (MultiBuyOffer multiBuyOffer : multiBuyOfferList) {
                int countSKU = (int) productList.stream()
                        .filter(product -> product.equals(multiBuyOffer.getProduct())).count();
                int numberOfDiscounts = (countSKU / multiBuyOffer.getNumberOfItems());
                total = total - (offerDiscount(multiBuyOffer) * numberOfDiscounts);
            }
            return total;
        } catch (IllegalArgumentException e) {
            return -1;
        }
    }

    private int offerDiscount(MultiBuyOffer offer) {
        return (offer.getNumberOfItems() * offer.getProduct().getPrice()) - offer.getPrice();
    }
}

