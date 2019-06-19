package befaster.solutions.CHK;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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

    public boolean containsAtLeast(int numberOfProducts, List<Product> products) {
        return products.stream().map(this::get).reduce(0, Integer::sum) >= numberOfProducts;
    }

    public void remove(Map<Product, Integer> products) {
        products.forEach((product, num) -> productCountMap.put(product, productCountMap.get(product)-num));
    }

    public void remove(Product product) {
        productCountMap.put(product, productCountMap.get(product) - 1);
    }

    /**
     *
     * @param product
     * @param numberToRemove
     * @return number left to remove
     */
    public int tryToRemove(int numberToRemove, Product product) {
        //can add error validation later
        int sum = productCountMap.get(product) - numberToRemove;
        if (sum >= 0) {
            productCountMap.put(product, sum);
            return numberToRemove;
        } else {
            productCountMap.put(product, 0);
            return sum * -1;
        }
    }

    public int removeMostExpensive(int numberOfProducts, List<Product> products) {
        products.sort(Comparator.comparingInt(Product::getPrice));
        int priceOfRemoved = 0;

        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            while (get(product) > 0) {
                remove(product);
                priceOfRemoved += product.getPrice();
            }
        }

    }
}




