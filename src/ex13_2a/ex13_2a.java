package ex13_2a;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class ex13_2a {
	public static void main(String[] args) {
		double max = 0, min = 1000, sum = 0, average = 0;
		String filename;
		ObjectOutputStream outputStream = null;
		ObjectInputStream inputStream = null;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please type File Name : ");
		filename = keyboard.nextLine();
		keyboard.close();
		
	
		try {
			outputStream = new ObjectOutputStream(new FileOutputStream(filename));
			
			for(int i = 0; i < 10; i++) {
				double randomValue = Math.random();
				outputStream.writeDouble(randomValue);
			}
			
			outputStream.close();
			
			inputStream = new ObjectInputStream(new FileInputStream(filename));
			
			try {
				while (true) {
					double d = inputStream.readDouble();
					sum += d;
					
					if(max < d) max = d;
					if(min > d) min = d;
				}
			}
			catch (EOFException e) {
				System.out.println("File END");
			}
			
			inputStream.close();
			
			average = (double) sum / 10;
			System.out.println("Min : " + min);
			System.out.println("Max : " + max);
			System.out.println("Sum : " + sum);
			System.out.println("Average : " + average);
			
		} catch (FileNotFoundException e) {
			System.out.println("Can't find File!");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
