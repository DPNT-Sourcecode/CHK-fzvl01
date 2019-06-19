package befaster.solutions.CHK;

public enum Product {
    A(50),
    B(30),
    C(20),
    D(15),
    E(40);

    private int price;

    Product(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}

