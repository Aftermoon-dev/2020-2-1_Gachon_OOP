package dev.aftermoon.gachon.oop.week4.ex4_5;

import java.util.Scanner;

public class ex4_5 {
	public static void main(String[] args) {
		int option = 0;
		Grade grade = new Grade();
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.print("\n\nGrade Program\n1. Set number of each of letter grades\n2. Get number of each of letter grades\n3. Get Total Number\n4. Get Percentage of each letter grade\n5. Draw a bar graph\n6. Exit\nPlease select option : ");
			option = scanner.nextInt();
			
			if(option == 1) {
				int a, b, c, d, f;
				System.out.print("Please enter Number of A : ");
				a = scanner.nextInt();
				System.out.print("Please enter Number of B : ");
				b = scanner.nextInt();
				System.out.print("Please enter Number of C : ");
				c = scanner.nextInt();
				System.out.print("Please enter Number of D : ");
				d = scanner.nextInt();
				System.out.print("Please enter Number of F : ");
				f = scanner.nextInt();
				grade.setGradesNumber(a, b, c, d, f);
			}
			else if(option == 2) {
				int[] num = grade.getGradesNumber();
				System.out.println("A : " + num[0] + " B : " + num[1] + " C : " + num[2] + " D : " + num[3] + " F : " + num[4]);
			}
			else if(option == 3) {
				System.out.println("Total Number : " + grade.getGradesTotalNumber());
			}
			else if(option == 4) {
				double[] per = grade.getGradesPercentage();
				System.out.println("A : " + per[0] + "%" + " B : " + per[1] + "%" + " C : " + per[2] + "%"  + " D : " + per[3] + "%"  + " F : " + per[4] + "%" );
			}
			else if(option == 5) {
				grade.drawBarGraph();
			}
			else if(option == 6) {
				break;
			}
			else {
				System.out.println("Not Exist Option! Please re-select!");
			}
		}
		scanner.close();
	}
}
