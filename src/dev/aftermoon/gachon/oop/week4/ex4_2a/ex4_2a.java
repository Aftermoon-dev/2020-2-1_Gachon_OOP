package dev.aftermoon.gachon.oop.week4.ex4_2a;

import java.util.Scanner;

import dev.aftermoon.gachon.oop.week4.ex4_2a.MotorBoat;

public class ex4_2a {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		MotorBoat boat = new MotorBoat();
		double time = 0;
		
		System.out.print("Please enter Boat's Amount of Fuel in the tank : ");
		boat.setAmountFuel(scanner.nextDouble());
		
		System.out.print("Please enter Boat's Current Speed : ");
		boat.setCurrentSpeed(scanner.nextDouble());
		
		System.out.print("Please enter Efficiency of the boat's motor : ");
		boat.setEfficiency(scanner.nextDouble());
		
		System.out.print("Please enter Time : ");
		time = scanner.nextDouble();
		
		scanner.close();
		
		boat.printUsedFuel(time);
		boat.printTimeTravelDistance(time);
		boat.printCurrentMaxTravelDistance();
	}
}
