package dev.aftermoon.gachon.oop.week2;

import java.util.Scanner;

public class ex2_1b {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double num;
		
		System.out.print("Please type a Temperature in Fahrenheit : ");
		num = scanner.nextDouble();
		scanner.close();
		double result = 5.0 * (num - 32.0) / 9.0;
		System.out.println(result + "'C");
	}
}
