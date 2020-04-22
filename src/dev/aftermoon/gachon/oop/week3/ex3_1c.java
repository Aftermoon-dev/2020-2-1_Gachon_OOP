package dev.aftermoon.gachon.oop.week3;

import java.util.Scanner;

public class ex3_1c {
	public static void main(String[] args) {
		String word;
		double gradeValue = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter your grade letter : ");
		word = scanner.next();
		scanner.close();
		
		switch (word.charAt(0)) {
			case 'A':
				gradeValue = 4.0;
				break;
			case 'B':
				gradeValue = 3.0;
				break;
			case 'C':
				gradeValue = 2.0;
				break;
			case 'D':
				gradeValue = 1.0;
				break;
			default:
				gradeValue = 0.0;
				break;
		}
		
		System.out.println(gradeValue);
		
	}
}
