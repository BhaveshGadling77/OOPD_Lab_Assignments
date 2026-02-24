public class Car extends AutoVehicle {
	public Car(String brand, String fuel, int maxSpeed, double mileage) {
		super(brand, fuel, maxSpeed, 4, mileage);
	}
	@Override 
	public void displayInfo() {
		System.out.println("Car Information: ");
		super.displayInfo();
	}

	public void honk() {
		System.out.println("Car is honking...");
	}
}
