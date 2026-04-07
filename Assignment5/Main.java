public class Main {
    public static void main(String[] args) {

        Inventory<Electronics> electronicsInventory = new Inventory<>();
        Inventory<Grocery> groceryInventory = new Inventory<>();
        Inventory<Clothing> clothingInventory = new Inventory<>();

        Electronics e1 = new Electronics("Laptop", 60000, 2);
        Grocery g1 = new Grocery("Milk", 50, "10-04-2026");
        Clothing c1 = new Clothing("T-Shirt", 800, "M");

        electronicsInventory.addItem(e1);
        groceryInventory.addItem(g1);
        clothingInventory.addItem(c1);

        System.out.println("Electronics:");
        electronicsInventory.displayItems();

        System.out.println("Groceries:");
        groceryInventory.displayItems();

        System.out.println("Clothing:");
        clothingInventory.displayItems();
    }
}
