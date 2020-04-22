package dev.aftermoon.gachon.oop.week3;

import java.util.Scanner;

public class ex3_2b {
	public static void main(String[] args) {
		int[] count = new int[5];
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			int num = 0;
			System.out.print("Please enter a integer percentage (0~100) (If you want exit, Enter Any negative integer.): ");
			num = scanner.nextInt();
			
			if(num < 0) {
				break;
			}
			else { 
				if(num > 100) {
					System.out.println("You can enter from 0 to 100. So Ignored.");
				}
				else if(num >= 90) {
					count[0]++;
				}
				else if(num >= 80) {
					count[1]++;
				}
				else if(num >= 70) {
					count[2]++;
				}
				else if(num >= 60) {
					count[3]++;
				}
				else {
					count[4]++;
				}
			}
		}
		
		scanner.close();
		int total = count[0] + count[1] + count[2] + count[3] + count[4];
		System.out.println("Total Count : " + total);
		System.out.println("A count : " + count[0] + ", B count : " + count[1] + ", C count : " + count[2] + ", D count : " + count[3] + ", F count : " + count[4]);
	}
}
