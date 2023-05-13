package vehicles;

public class Vehicle {

	public static String Make = new String("Augur");
	public static int numVehicles = 0;
	private String chassisNo;
	private String model;

	public Vehicle(String model) {
		numVehicles++;
		this.chassisNo = "ch" + numVehicles;
		this.model = model;
		System.out.println("\nVehicle manufactured");
	}

	public static class Engine extends Vehicle{
		
		private static final String MAKE = "Predicter";
		private static final int CAPACITY = 1600;
		
		public Engine(String model) {
			super(model);
		}
		
		public static String getMAKE() {
			return MAKE;
		}

		public static int getCAPACITY() {
			return CAPACITY;
		}

	}

	@Override
	public String toString() {
		return "Vehicle [chassisNo=" + chassisNo + ", model=" + model + ", Manufacturer=" + Make + ", Marca=" + Engine.MAKE
				+ ", Motor=" + Engine.CAPACITY + "]";
	}

	public String getChassisNo() {
		return chassisNo;
	}

	public void setChassisNo(String chassisNo) {
		this.chassisNo = chassisNo;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public static String getMake() {
		return Make;
	}

	public static void setMake(String make) {
		Make = make;
	}

	public static int getNumVehicles() {
		return numVehicles;
	}

	public static void setNumVehicles(int numVehicles) {
		Vehicle.numVehicles = numVehicles;
	}

}
