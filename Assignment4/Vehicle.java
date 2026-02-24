public class Vehicle {

	protected String brand;
	protected String fuel;
	protected int maxSpeed;
	protected int wheels;
	Vehicle(String brand, String fuel, int maxSpeed, int wheels) {

		this.brand = brand;
		this.fuel = fuel;
		this.maxSpeed = maxSpeed;
		this.wheels = wheels;
	}

	public void displayInfo() {
		System.out.println("Vehicle: " + brand);
		System.out.println("Fuel: " + fuel);
		System.out.println("Max Speed: " + maxSpeed);
		System.out.println("Total Wheels: " + wheels);
	}

	public void start() {
		System.out.println("Vehicle is started Successfully.");
	}

	public void stop() {
		System.out.println("Vehicle is stopped Successfully.");
	}
}
