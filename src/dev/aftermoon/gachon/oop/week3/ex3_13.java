package dev.aftermoon.gachon.oop.week3;

import java.util.Scanner;

public class ex3_13 {
	public static void main(String[] args) {
		int size = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter triangle size : ");
		size = scanner.nextInt();
		scanner.close();
		
		for(int i = 0; i <= size; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		for(int i = size - 1; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
