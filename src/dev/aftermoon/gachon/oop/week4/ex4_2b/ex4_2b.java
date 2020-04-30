package dev.aftermoon.gachon.oop.week4.ex4_2b;

import java.util.Scanner;

import dev.aftermoon.gachon.oop.week4.ex4_2b.Counter;

public class ex4_2b {
	public static void main(String[] args) {
		int option = 0;
		Counter counter = new Counter();
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.print("\n\nCounter Program\n1. Increase\n2. Decrease\n3. Get Current Count\n4. Reset\n5. Exit\nPlease select option : ");
			option = scanner.nextInt();
			
			if(option == 1) {
				counter.increaseCount();
			}
			else if(option == 2) {
				counter.decreaseCount();
			}
			else if(option == 3) {
				System.out.println("Get Current Count : " + counter.getCount());
			}
			else if(option == 4) {
				counter.resetCount();
			}
			else if(option == 5) {
				break;
			}
			else {
				System.out.println("Not Exist Option! Please re-select!");
			}
		}
		scanner.close();
	}
}
