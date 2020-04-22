package dev.aftermoon.gachon.oop.week1;

import java.util.Scanner;

public class ex1_2b {
	public static void main(String[] args) {
		int num1, num2;
		int result = 1;
		System.out.print("Please type 2 numbers : ");
		Scanner input = new Scanner(System.in);
		num1 = input.nextInt();
		num2 = input.nextInt();
		input.close();
		
		result += num2 - num1;
		System.out.println(result);
	}
}
