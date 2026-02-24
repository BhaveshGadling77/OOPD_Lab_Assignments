public class AutoVehicle extends Vehicle {
	protected double mileage;

	public AutoVehicle(String brand, String fuel, int maxSpeed, int wheels, double mileage) {
		super(brand, fuel, maxSpeed, wheels);
		this.mileage = mileage;
	}
	@Override 
	public void displayInfo() {
		System.out.println("AutoVehicle Info: ");
		super.displayInfo();
		System.out.println("Mileage: " + mileage);
	}
}
