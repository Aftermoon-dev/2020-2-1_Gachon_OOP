package dev.aftermoon.gachon.oop.week2;

import java.util.Scanner;

public class ex2_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String text;
		System.out.print("Please type a sentense : ");
		text = scanner.nextLine();
		scanner.close();
		
		int firstWordIndex = text.indexOf(" ");
		String centerSentense = text.substring(firstWordIndex + 1);
		String firstWord = text.substring(0, firstWordIndex);
		String result = centerSentense.substring(0, 1).toUpperCase() + centerSentense.substring(1) + " " + firstWord;
		System.out.println(result);
	}
}
