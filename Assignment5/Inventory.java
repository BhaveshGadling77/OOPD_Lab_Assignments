import java.util.ArrayList;

class Inventory<T extends Item> {
    private ArrayList<T> items = new ArrayList<>();

    void addItem(T item) {
        items.add(item);
    }

    void removeItem(T item) {
        items.remove(item);
    }

    void displayItems() {
        for (T item : items) {
            item.display();
            System.out.println("-------------------");
        }
    }
}
