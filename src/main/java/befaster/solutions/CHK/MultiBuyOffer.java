package befaster.solutions.CHK;

public class MultiBuyOffer {

    private int numberOfItems;

    private int price;

    public MultiBuyOffer(int numberOfItems, int price) {
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
