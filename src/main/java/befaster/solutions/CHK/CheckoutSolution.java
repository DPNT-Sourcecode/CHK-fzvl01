package befaster.solutions.CHK;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CheckoutSolution {

    List<MultiBuyOffer> multiBuyOfferList = Arrays.asList(MultiBuyOffer.values());

    public Integer checkout(String skus) {
        if (skus.isEmpty()){
            return 0;
        }

        String[] split = skus.split("");

        try {
            List<Product> productList = Arrays.stream(split).map(Product::valueOf).collect(Collectors.toList());
            int total = productList.stream().map(Product::getPrice).reduce(0, Integer::sum);

            multiBuyOfferList.forEach(multiBuyOffer -> {
                int countSKU = (int) productList.stream().filter(product -> product.name().equals(multiBuyOffer.getSKU())).count();
                int numberOfDiscounts = (countSKU/multiBuyOffer.getNumberOfItems());

            });

        } catch (IllegalArgumentException e) {
            return -1;
        }
    }
}



