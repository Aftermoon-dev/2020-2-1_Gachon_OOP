package dev.aftermoon.gachon.oop.week4.ex4_1;

import java.util.Scanner;

public class ex4_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		MotorBoat boat = new MotorBoat();
		double time = 0;
		
		System.out.print("Please enter Boat's Capacity of Fuel Tank : ");
		boat.capacityFuel = scanner.nextDouble();
		
		System.out.print("Please enter Boat's Amount of Fuel in the tank : ");
		boat.amountFuel = scanner.nextDouble();
		
		System.out.print("Please enter Boat's Maximum Speed : ");
		boat.maximumSpeed = scanner.nextDouble();
		
		System.out.print("Please enter Boat's Current Speed : ");
		boat.currentSpeed = scanner.nextDouble();
		
		System.out.print("Please enter Efficiency of the boat's motor : ");
		boat.efficiency = scanner.nextDouble();
		
		System.out.print("Please enter Time : ");
		time = scanner.nextDouble();
		
		scanner.close();
		
		boat.printUsedFuel(time);
		boat.printTimeTravelDistance(time);
		boat.printCurrentMaxTravelDistance();
	}
}
