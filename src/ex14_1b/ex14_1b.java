package ex14_1b;

import java.util.ArrayList;
import java.util.Scanner;

public class ex14_1b {
	public static void main(String[] args) {
		int sum = 0;
		double average = 0.0;
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		while(true) {
			System.out.print("Please type a score : ");
			int num = scanner.nextInt();
			
			if(num >= 0) {
				list.add(num);
			}
			else break;
		}
		
		for(int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		
		average = (double) sum / list.size();
		System.out.println("Average : " + average);
		
		System.out.println("Above the average : ");
		
		int j = 0;
		while(list.size() > j) {
			if(list.get(j) > average) {
				System.out.print(list.get(j) + " ");
			}
			j++;
		}
		
		scanner.close();
	}
}
