package dev.aftermoon.gachon.oop.week4.ex4_1;

public class MotorBoat {
	public double capacityFuel;
	public double amountFuel;
	public double maximumSpeed;
	public double currentSpeed;
	public double efficiency;
	
	public void printUsedFuel(double t) {
		double maxAmount = (efficiency * (maximumSpeed * maximumSpeed)) * t;
		double currentAmount = (efficiency * (currentSpeed * currentSpeed)) * t;
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
}
