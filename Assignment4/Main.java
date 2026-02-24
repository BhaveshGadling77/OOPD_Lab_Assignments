public class Main {
    public static void main(String[] args) {

        Vehicle v1 = new Bike("Yamaha", "Petrol", 120, 45);
        Vehicle v2 = new Car("Toyota", "Diesel", 180, 20);

        // Polymorphism (Runtime)
        v1.displayInfo();
        v1.start();
        v1.stop();

        System.out.println();

        v2.displayInfo();
        v2.start();
        v2.stop();

        System.out.println();

        // Access specific methods
        Bike bike = new Bike("Honda", "Petrol", 110, 50);
        bike.ride();

        Car car = new Car("BMW", "Petrol", 250, 15);
        car.honk();
    }
}
