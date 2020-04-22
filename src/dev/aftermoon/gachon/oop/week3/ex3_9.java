package dev.aftermoon.gachon.oop.week3;

import java.util.Scanner;

public class ex3_9 {
	public static void main(String[] args) {
		String str = "";
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("Please type a String : ");
			str = scanner.next();
			
			str = str.toLowerCase();
			
			if(str.equals("quit")) {
				break;
			}
			else {
				String str1 = str.substring(1) + str.charAt(0);
				String str2 = "";
				for(int i = str.length() - 1; i >= 0; i--) {
					str2 += str1.charAt(i);
				}
				
				if(str.equals(str2)) {
					System.out.println("Correct!");
				}
				else {
					System.out.println("Not Correct.");
				}
			}
		}
		scanner.close();
	}
}
