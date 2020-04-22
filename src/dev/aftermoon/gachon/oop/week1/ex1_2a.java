package dev.aftermoon.gachon.oop.week1;


import java.util.Scanner;

public class ex1_2a {
	public static void main(String[] args) {
		int year, age;
		System.out.print("Please Enter Your Birth Year : ");
		Scanner input = new Scanner(System.in);
		year = input.nextInt();
		input.close();
		age = 2020 - year;
		System.out.println("Your Age : " + age);
	}
}
