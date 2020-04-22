package dev.aftermoon.gachon.oop.week3;

import java.util.Scanner;

public class ex3_1b {
	public static void main(String[] args) {
		int price;
		int quarters = 0, dimes = 0, nickels = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please type a price of an item in cents (a multiple of 5 between 25 and 100) : ");
		price = scanner.nextInt();
		scanner.close();
		
		if(price < 25 || price % 5 != 0 || price > 100) {
			System.out.print("Price is not valid!");
		}
		else {
			int change = 100 - price;
			int originalChange = change;
			
			while(change >= 0) {
				if(change - 25 >= 0) {
					quarters++;
					change -= 25;
				}
				else if(change - 10 >= 0) {
					dimes++;
					change -= 10;
				}
				else if(change - 5 >= 0) {
					nickels++;
					change -= 5;
				}
				else {
					break;
				}
			}
			
			System.out.println("An item of " + price + " cents, the change is " + originalChange + " cents, " + "which is given by " + quarters + " quarters, " + dimes + " dimes, " + nickels + " nickels");
		}
	
	}
}
