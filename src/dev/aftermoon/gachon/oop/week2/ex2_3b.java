package dev.aftermoon.gachon.oop.week2;

import java.util.Scanner;

public class ex2_3b {
	public static void main(String[] args) {
		double radius = 0;
		double depth = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please type a radius (in inches) : ");
		radius = scanner.nextDouble();
		
		System.out.print("Please type a depth (in feet) : ");
		depth = scanner.nextDouble();
		scanner.close();
		
		double footr = radius / 12;
		double volume = ((3.141592 * (footr * footr)) * depth) * 7.48;
		System.out.println("a " + depth + " foot well with a radius of " + radius + " inches holds about " + volume  + " gallons of water.");
	}
}
