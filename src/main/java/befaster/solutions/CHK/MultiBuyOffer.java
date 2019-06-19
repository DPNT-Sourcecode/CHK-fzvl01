package befaster.solutions.CHK;

public enum MultiBuyOffer {
    ThreeA("A", 3, 130),
    TwoB("B", 2, 45);

    private String SKU;

    private int numberOfItems;

    private int price;

    MultiBuyOffer(String SKU, int numberOfItems, int price) {
        this.SKU = SKU;
        this.numberOfItems = numberOfItems;
        this.price = price;
    }

    public String getSKU() {
        return SKU;
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }

    public int getPrice() {
        return price;
    }
}


