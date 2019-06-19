package befaster.solutions.CHK;


import java.util.Arrays;

public class CheckoutSolution {
    public Integer checkout(String skus) {
        if (skus.isEmpty()){
            return 0;
        }

        String[] split = skus.split("");

        try {
            int total = Arrays.stream(split).map(Product::valueOf).map(Product::getPrice).reduce(0, Integer::sum);

        } catch (IllegalArgumentException e) {
            return -1;
        }
    }
}





