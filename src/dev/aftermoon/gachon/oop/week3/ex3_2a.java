package dev.aftermoon.gachon.oop.week3;

import java.util.Scanner;

public class ex3_2a {
	public static void main(String[] args) {
		int max = 0, min = 0, count = 0;
		double average = 0.0;
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			int num = 0;
			System.out.print("Please enter a non-negative integer (If you want exit, Enter Any negative integer.): ");
			num = scanner.nextInt();
			
			if(num < 0) {
				break;
			}
			else {
				if(count == 0) {
					max = num;
					min = num;
				}
				else {
					if(max < num) {
						max = num;
					}
					
					if(min > num) {
						min = num;
					}
				}
				average += num;
				count++;
			}
		}
		
		scanner.close();
		average = average / count;
		System.out.println(count);
		System.out.println("Max : " + max + ", Min : " + min + ", Average : " + average);
	}
}
