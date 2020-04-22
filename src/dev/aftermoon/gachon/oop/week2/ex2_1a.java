package dev.aftermoon.gachon.oop.week2;

import java.util.Scanner;

public class ex2_1a {
	public static void main(String[] args) {
		int num;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please type a four-digit Integer : ");
		num = scanner.nextInt();
		scanner.close();
		System.out.println(num / 1000 + "\n" + (num / 100) % 10 + "\n" + (num / 10) % 10 + "\n" + (num % 1000) % 10);
	}
}
