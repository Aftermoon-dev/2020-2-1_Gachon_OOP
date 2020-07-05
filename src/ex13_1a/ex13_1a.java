package ex13_1a;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ex13_1a {
	public static void main(String[] args) {
		int max = 0, min = 1000, sum = 0;
		double average = 0;
		String filename;
		PrintWriter outputStream = null;
		Scanner keyboard = new Scanner(System.in);
		Scanner file = null;
		
		System.out.print("Please type File Name : ");
		filename = keyboard.nextLine();
		keyboard.close();
		
		try {
			outputStream = new PrintWriter(filename);
		} catch (FileNotFoundException e) {
			System.out.println("Can't find File!");
			e.printStackTrace();
			System.exit(1);
		}
		
		for(int i = 0; i < 10; i++) {
			int randomValue = (int) (Math.random() * 1000) + 1;
 			outputStream.append(String.valueOf(randomValue) + "\n");
		}
		
		outputStream.close();
		
		try {
			file = new Scanner(new File(filename));
		} catch (FileNotFoundException e) {
			System.out.println("Can't find File!");
			e.printStackTrace();
			System.exit(1);
		}
		
		while(file.hasNextLine()) {
			int num = Integer.parseInt(file.nextLine());
			sum += num;
			
			if(max < num) max = num;
			if(min > num) min = num;
		}
		
		average = (double) sum / 10;
		
		file.close();
		
		System.out.println("Min : " + min);
		System.out.println("Max : " + max);
		System.out.println("Sum : " + sum);
		System.out.println("Average : " + average);
	}
}
