package ex7_1a;

import java.util.Scanner;

public class ex7_1a {
	public static void main(String[] args) {
		int num = 0;
		int sum = 0;
		double average = 0.0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please type a number of score : ");
		num = scanner.nextInt();
		
		int[] scores = new int[num];
		
		for(int i = 0; i < num; i++) {
			System.out.print("Please type a score : ");
			scores[i] = scanner.nextInt();
			sum += scores[i];
		}
		
		average = sum / num;
		System.out.println("Average : " + average);
		
		System.out.println("Above the average : ");
		for(int i = 0; i < num; i++) {
			if(scores[i] > average) {
				System.out.print(scores[i] + " ");
			}
		}
		
		scanner.close();
	}
}
