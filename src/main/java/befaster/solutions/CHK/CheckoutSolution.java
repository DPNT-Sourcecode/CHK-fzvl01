package befaster.solutions.CHK;


import java.util.Arrays;

public class CheckoutSolution {
    public Integer checkout(String skus) {

        char[] charArray = skus.toCharArray();

        return Arrays.stream().map(Product::valueOf).map(Product::getPrice).reduce(0, Integer::sum);
    }
}


