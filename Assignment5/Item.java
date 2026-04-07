class Item {
    String name;
    double price;

    Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println("Name: " + name + ", Price: " + price);
    }
}
