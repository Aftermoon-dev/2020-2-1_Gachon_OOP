package ex10_11;

import java.util.Arrays;

public class ex10_11 {
	public static void main(String[] args) {
		Student[] sArray = {
				new Student("B", 3),
				new Student("A", 2),
				new Student("C", 1),
				new Student("D", 5),
				new Student("E", 4)
		};
		
		Arrays.sort(sArray);
		
		for(int i = 0; i < 5; i++) {
			System.out.println(sArray[i].getName() + ", " + sArray[i].getStudentNumber());
		}
	}
}
