class Clothing extends Item {
    String size;

    Clothing(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }

    void display() {
        super.display();
        System.out.println("Size: " + size);
    }
}
