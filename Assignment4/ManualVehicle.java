public class ManualVehicle extends Vehicle {
	
	public ManualVehicle(String brand, int maxSpeed, int wheels) {
		super(brand, "None", maxSpeed, wheels);
	}

	@Override
	public void displayInfo() {
		System.out.println("Manual Vehicle Info: ");
		super.displayInfo();
	}
}
