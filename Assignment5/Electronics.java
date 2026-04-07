class Electronics extends Item {
    int warranty;

    Electronics(String name, double price, int warranty) {
        super(name, price);
        this.warranty = warranty;
    }

    void display() {
        super.display();
        System.out.println("Warranty: " + warranty + " years");
    }
}
