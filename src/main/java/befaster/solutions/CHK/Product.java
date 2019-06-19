package befaster.solutions.CHK;

public enum Product {
    A(50), B(30), C(20), D(15);


    private int price;

    private MultiBuyOffer offer;

    Product(int price) {
        this.price = price;
    }

    Product(int price, MultiBuyOffer offer) {
        this.price = price;
        this.offer = offer;
    }

    public int getPrice() {
        return price;
    }

    public MultiBuyOffer getOffer() {
        return offer;
    }
}

