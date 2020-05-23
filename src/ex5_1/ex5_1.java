package ex5_1;

public class ex5_1 {
	public static void main(String[] args) {
		MotorBoat boat1 = new MotorBoat();
		MotorBoat boat2 = new MotorBoat();
		
		System.out.println("Boat 1 : ");
		boat1.setAmountFuel(60.0);
		boat1.setCurrentSpeed(100);
		boat1.setEfficiency(0.5);
		
		boat1.printUsedFuel(5);
		boat1.printTimeTravelDistance(5);
		boat1.printCurrentMaxTravelDistance();
		
		System.out.println("Boat 2 : ");
		boat2.setAmountFuel(30.0);
		boat2.setCurrentSpeed(20.0);
		boat2.setEfficiency(0.3);
		
		boat2.printUsedFuel(5);
		boat2.printTimeTravelDistance(5);
		boat2.printCurrentMaxTravelDistance();
		
		
		if(boat1.equals(boat2)) {
			System.out.println("Equal!");
		}
		else {
			System.out.println("Not Equal!");
		}
	}
}
