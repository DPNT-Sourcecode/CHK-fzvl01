package befaster.solutions.CHK;

import java.util.Map;

public enum MultiBuyOffer {
    ThreeA(Map.of(Product.A, 3), 130, Product.A, 3),
    FiveA(Map.of(Product.A, 5), 200, Product.A, 5),
    TwoB(Map.of(Product.B, 2), 45, Product.B, 2),
    TwoE(Map.of(Product.E, 2, Product.B, 1), 0, Product.B, 1),
    ThreeF(Map.of(Product.F, 3), 0, Product.F, 1),
    FiveH(Map.of(Product.H, 5), 45, Product.H, 5),
    TenH(Map.of(Product.H ,10), 80, Product.H, 10),
    TwoK(Map.of(Product.K, 2), 150, Product.K, 2);

    private Map<Product, Integer> requiredProducts;

    private int price;

    private int discount;


    MultiBuyOffer(Map<Product, Integer> requiredProducts, int price,
            Product discountedProduct, int discountedNumber) {
        this.requiredProducts = requiredProducts;
        this.price = price;
        this.discount = (discountedProduct.getPrice()* discountedNumber) - price;
    }

    public Map<Product, Integer> getRequiredProducts() {
        return requiredProducts;
    }

    public int getPrice() {
        return price;
    }

    public int getDiscount() {
        return discount;
    }
}
