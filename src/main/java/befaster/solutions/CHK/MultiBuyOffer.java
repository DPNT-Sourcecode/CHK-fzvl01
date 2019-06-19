package befaster.solutions.CHK;

public enum MultiBuyOffer {
    ThreeA(Product.A, 3, 130, Product.A, 3),
    FiveA(Product.A, 5, 200, Product.A, 5),
    TwoB(Product.B, 2, 45, Product.B, 2),
    TwoE(Product.E, 2, 0, Product.B, 1);

    private Product requiredProduct;

    private int requiredNumber;

    private int price;

    private Product replacedProduct;

    private int replacedNumber;

    private int discount;


    MultiBuyOffer(Product requiredProduct, int requiredNumber, int price,
            Product replacedProduct, int replacedNumber) {
        this.requiredProduct = requiredProduct;
        this.requiredNumber = requiredNumber;
        this.price = price;
        this.replacedProduct = replacedProduct;
        this.replacedNumber = replacedNumber;
        this.discount = (replacedProduct.getPrice()* replacedNumber) - price;
    }

    public Product getRequiredProduct() {
        return requiredProduct;
    }

    public int getRequiredNumber() {
        return requiredNumber;
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




