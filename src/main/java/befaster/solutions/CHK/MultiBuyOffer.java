package befaster.solutions.CHK;

import java.util.Map;

public enum MultiBuyOffer {
    ThreeA(Product.A, 3, 130, Product.A, 3),
    FiveA(Product.A, 5, 200, Product.A, 5),
    TwoB(Product.B, 2, 45, Product.B, 2),
    TwoE(Product.E, 2, 0, Product.B, 1);

    private Map<Product, Integer> requiredProducts;

    private int price;

    private Product replacedProduct;

    private int replacedNumber;

    private int discount;


    MultiBuyOffer(Map<Product, Integer> requiredProducts, int price,
            Product replacedProduct, int replacedNumber) {
        this.price = price;
        this.replacedProduct = replacedProduct;
        this.replacedNumber = replacedNumber;
        this.discount = (replacedProduct.getPrice()* replacedNumber) - price;
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

    public Product getReplacedProduct() {
        return replacedProduct;
    }

    public int getReplacedNumber() {
        return replacedNumber;
    }
}





