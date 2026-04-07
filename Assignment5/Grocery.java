class Grocery extends Item {
    String expiryDate;

    Grocery(String name, double price, String expiryDate) {
        super(name, price);
        this.expiryDate = expiryDate;
    }

    void display() {
        super.display();
        System.out.println("Expiry Date: " + expiryDate);
    }
}
