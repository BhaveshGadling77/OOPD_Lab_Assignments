public class Bike extends AutoVehicle{
	
	public Bike(String brand, String fuel, int maxSpeed, double mileage) {
		super(brand, fuel, maxSpeed, 2, mileage); //2 because it's bike
	}
	
	@Override
	public void displayInfo() {
		System.out.println("Bike Information: ");
		super.displayInfo();
	}

	public void ride() {
		System.out.println("Bike is riding...");
	}
}
