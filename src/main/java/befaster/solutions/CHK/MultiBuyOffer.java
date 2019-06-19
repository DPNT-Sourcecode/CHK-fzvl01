package befaster.solutions.CHK;

public enum MultiBuyOffer {
    ThreeA(Product.A, 3, 130),
    TwoB(Product.B, 2, 45);

    private Product product;

    private int numberOfItems;

    private int price;

    MultiBuyOffer(Product product, int numberOfItems, int price) {
        this.product = product;
        this.numberOfItems = numberOfItems;
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }

    public int getPrice() {
        return price;
    }
}



