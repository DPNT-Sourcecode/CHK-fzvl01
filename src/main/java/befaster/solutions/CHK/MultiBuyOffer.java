package befaster.solutions.CHK;

public enum MultiBuyOffer {
    ThreeA(Product.A, 3, 130),
    TwoB(Product.B, 2, 45);

    private Product requirement;

    private int numberOfItems;

    private int price;

    private int discount;

    MultiBuyOffer(Product requirement, int numberOfItems, int price) {
        this.requirement = requirement;
        this.numberOfItems = numberOfItems;
        this.price = price;
        this.discount = (requirement.getPrice()*numberOfItems) - price;
    }

    public Product getRequirement() {
        return requirement;
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }

    public int getPrice() {
        return price;
    }

    public int getDiscount() {
        return discount;
    }
}

