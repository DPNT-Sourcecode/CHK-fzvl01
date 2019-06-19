package befaster.solutions.CHK;

import java.util.Map;

public enum MultiBuyOffer {
    ThreeA(Map.of(Product.A, 3), 130, Product.A, 3),
    FiveA(Map.of(Product.A, 5), 200, Product.A, 5),
    TwoB(Map.of(Product.B, 2), 45, Product.B, 2),
    TwoE(Map.of(Product.E, 2, Product.B, 1), 0, Product.B, 1);

    private Map<Product, Integer> requiredProducts;

    private int price;

    private Product discountedProduct;

    private int discountedNumber;

    private int discount;


    MultiBuyOffer(Map<Product, Integer> requiredProducts, int price,
            Product discountedProduct, int discountedNumber) {
        this.price = price;
        this.discountedProduct = discountedProduct;
        this.discountedNumber = discountedNumber;
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

    public Product getDiscountedProduct() {
        return discountedProduct;
    }

    public int getDiscountedNumber() {
        return discountedNumber;
    }
}


