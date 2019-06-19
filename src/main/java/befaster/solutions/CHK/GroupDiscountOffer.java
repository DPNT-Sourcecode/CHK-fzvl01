package befaster.solutions.CHK;

import java.util.Arrays;
import java.util.List;

public enum GroupDiscountOffer {
    THREE_OF_STXYZ(Arrays.asList(Product.S, Product.T, Product.X, Product.Y, Product.Z), 3, 45);

    private List<Product> productList;

    private int numberOfProducts;

    private int price;

    GroupDiscountOffer(List<Product> productList, int numberOfProducts, int price) {
        this.productList = productList;
        this.numberOfProducts = numberOfProducts;
        this.price = price;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public int getNumberOfProducts() {
        return numberOfProducts;
    }

    public int getPrice() {
        return price;
    }
}

