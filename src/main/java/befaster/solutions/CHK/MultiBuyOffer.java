package befaster.solutions.CHK;

public enum MultiBuyOffer {
    A(3, 130),
    B(2, 45);

    private int numberOfItems;

    private int price;

    MultiBuyOffer(int numberOfItems, int price) {
        this.numberOfItems = numberOfItems;
        this.price = price;
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }

    public int getPrice() {
        return price;
    }
}
