package befaster.solutions.CHK;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

    private Map<Product, Integer> productCountMap = new HashMap<>();

    public void add(Product product) {
        if (productCountMap.containsKey(product)) {
            productCountMap.replace(product, productCountMap.get(product)+1);
        } else {
            productCountMap.put(product, 1);
        }
    }

    public boolean contains(Product product) {
        return productCountMap.containsKey(product) && productCountMap.get(product) > 0;
    }

    public int get(Product product) {
        return productCountMap.getOrDefault(product, 0);
    }

    public boolean contains(Map<Product, Integer> products) {
        return products.entrySet().stream().allMatch(productEntry -> productCountMap.containsKey(productEntry.getKey()) && productCountMap.get(productEntry.getKey()) >= productEntry.getValue());
    }

    public void remove(Map<Product, Integer> products) {
        products.forEach((product, num) -> productCountMap.put(product, productCountMap.get(product)-num));
    }
}




