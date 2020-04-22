package dev.aftermoon.gachon.oop.week3;

import java.util.Scanner;

public class ex3_10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			double balance = 0;
			double rate = 0;
			double annunally = 0;
			double monthly = 0;
			double daily = 0;
			
			System.out.print("Please enter your bank account balance (if you want quit, enter any negative value.) : ");
			balance = scanner.nextDouble();
			
			if(balance < 0) {
				break;
			}
			
			System.out.print("Please enter an interest rate : ");
			rate = scanner.nextDouble();
			
			annunally = balance;
			monthly = balance;
			daily = balance;
			
			for(int i = 0; i < 10; i++) {
				annunally += annunally * (rate * 0.01);
				for(int j = 0; j < 365; j++) {
					daily += daily * (rate/365 * 0.01);
				}
				
				for(int k = 0; k < 12; k++) {
					monthly += monthly * (rate/12 * 0.01);
				}
			}
			
			System.out.println("Annunally : " + annunally + ", Monthly : " + monthly + ", Daily : " + daily);
		}
		scanner.close();
	}
}
