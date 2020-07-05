package ex12_9;

import java.util.Scanner;

public class ex12_9 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Please type number of square : ");
		int square = s.nextInt();
		
		System.out.print("Please type number of grains : ");
		int grains = s.nextInt();
	
		System.out.println(getTotalGrains(square, grains));
		
		s.close();
	}
	
	public static long getTotalGrains(long k, long grains) {
		if(k == 1) {
			return grains;
		}
		else {
			return grains + getTotalGrains(k - 1, grains * 2);
		}	
	}
}
