package befaster.solutions.CHK;


import java.util.Arrays;

public class CheckoutSolution {
    public Integer checkout(String skus) {

        String[] split = skus.split("");
        
        return Arrays.stream(split).map(Product::valueOf).map(Product::getPrice).reduce(0, Integer::sum);
    }
}

