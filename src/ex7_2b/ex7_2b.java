package ex7_2b;

public class ex7_2b {
	public static void main(String[] args) {
		double[][] dbArray =  {
			{30.0, 23.5, 17.3, 3.2, 11.5, 2.7, 9.8, 38.1, 27.6},
			{7.2, 5.1, 11.5, 2.4, 16.1, 4.9, 18.2, 14.5, 12.1, 30.5},
			{123.2, 24.6, 37.1, 12.934, 45.8, 7.69, 4.27}
		};
		
		System.out.println("getSum (row 1) : " + getSum(dbArray, 1));
		System.out.println("getAverage (column 1) : " + getAverage(dbArray, 1));
	}
	
	public static double getSum(double[][] arr, int row) {
		double sum = 0;
		for(int i = 0; i < arr[row].length; i++) {
			sum += arr[row][i];
		}
		return sum;
	}
	
	public static double getAverage(double[][] arr, int column) {
		double avg = 0;
		
		for(int i = 0; i < arr.length; i++) {
			avg += arr[i][column];
		}
		avg /= arr.length;
		
		return avg;
	}
}
