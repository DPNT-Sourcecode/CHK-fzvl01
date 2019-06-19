package befaster.solutions.CHK;

import java.util.Map;

public class ShoppingCart {
    
    private Map<Product, Integer> productCountMap

    public void add(Product product) {
        if (productCountMap.containsKey(product)) {
            productCountMap.replace(product, productCountMap.get(product)+1);
        } else {
            productCountMap.put(product, 1);
        }
    }
}
