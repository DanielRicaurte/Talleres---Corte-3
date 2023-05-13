package vehicles;

import vehicles.Vehicle.Engine;

public class TestVehicle {

	public static void main(String[] args) {
		System.out.println("Manufacturer: " + Vehicle.Make);
        System.out.println("Number of vehicles manufactured: " + Vehicle.numVehicles);
		
		Vehicle vehicle1 = new Vehicle("Chevrolet");
		System.out.print(vehicle1.toString());
		Vehicle vehicle2 = new Vehicle("Edict");
		vehicle2.setMake("Seer");
		System.out.print(vehicle2.toString());
		Engine vehicle3 = new Vehicle.Engine("Fortune");
		System.out.print(vehicle3.toString());
		System.out.println("\nTotal number of vehicles manufactured: " + Vehicle.numVehicles);
	}
}
