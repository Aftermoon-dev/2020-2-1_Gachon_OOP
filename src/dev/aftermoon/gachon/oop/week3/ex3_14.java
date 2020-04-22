package dev.aftermoon.gachon.oop.week3;

import java.util.Scanner;

public class ex3_14 {
	public static void main(String[] args) {
		int bounce = 0;
		int time = 0;
		double velocity = 0;
		double height = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the inital velocity of the ball : ");
		velocity = scanner.nextFloat();
		
		scanner.close();
		
		while(bounce < 5) {
			if(height < 0.0) {
				System.out.println("Bounce!");
				height = height * -0.5;
				velocity = velocity * -0.5;
				bounce++;
			}
			else {
				System.out.println("Time : " + time + " Height: " + height);
				time++;
				height = height + velocity;
				velocity = velocity - 32;
			}
		}
	}
}
