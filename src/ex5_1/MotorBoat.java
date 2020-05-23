package ex5_1;

public class MotorBoat {
	public static final double capacityFuel = 60.0;
	public static final double maximumSpeed = 150.0;
	private double amountFuel;
	private double currentSpeed;
	private double efficiency;
	
	public void printUsedFuel(double t) {
		double maxAmount = efficiency * (maximumSpeed * maximumSpeed) * t;
		double currentAmount = efficiency * (currentSpeed * currentSpeed) * t;
		System.out.println("Amount of Fuel Used at the Maximum Speed : " + maxAmount);
		System.out.println("Amount of Fuel Used at the Current Speed : " + currentAmount);
	}
	
	public void printTimeTravelDistance(double t) {
		double distance = currentSpeed * t;
		System.out.println("Travel Distance of Time : " + distance);
	}
	
	public void printCurrentMaxTravelDistance() {
		double distance = amountFuel / (efficiency * currentSpeed);
		System.out.println("Current Max Travel Distance : " + distance);
	}

	public double getAmountFuel() {
		return amountFuel;
	}

	public void setAmountFuel(double amountFuel) {
		if(amountFuel <= capacityFuel) {
			this.amountFuel = amountFuel;
		}
		else {
			System.out.println("Error! Too many Fuel!");
			System.exit(0);
		}
	}

	public double getCurrentSpeed() {
		return currentSpeed;
	}

	public void setCurrentSpeed(double currentSpeed) {
		if(currentSpeed <= maximumSpeed) {
			this.currentSpeed = currentSpeed;
		}
		else {
			System.out.println("Error! Too Fast!");
			System.exit(0);
		}
		
	}

	public double getEfficiency() {
		return efficiency;
	}

	public void setEfficiency(double efficiency) {
		this.efficiency = efficiency;
	}
	
	public boolean equals(MotorBoat boat) {
		return (this.amountFuel == boat.getAmountFuel()) && (this.currentSpeed == boat.getCurrentSpeed()) && (this.efficiency == boat.getEfficiency());
	}
}
