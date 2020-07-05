package ex13_1b;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ex13_1b {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Scanner file = null;
		PrintWriter newfile = null;
		
		System.out.print("Please type Orignal File Name : ");
		String filename = keyboard.nextLine();
		
		System.out.print("Please type New File Name : ");
		String newFileName = keyboard.nextLine();
		keyboard.close();
		
		try {
			file = new Scanner(new File(filename));
		} catch (FileNotFoundException e) {
			System.out.println("Can't find File!");
			e.printStackTrace();
			System.exit(1);
		}
		
		try {
			newfile = new PrintWriter(newFileName);
		} catch (FileNotFoundException e) {
			System.out.println("Can't find File!");
			e.printStackTrace();
			System.exit(1);
		}
		
		int check = 0;
		while(file.hasNextLine()) {
			String[] text = file.nextLine().split(" ");
			
			int i = 0;
			while(i < text.length) {
				newfile.print(text[i] + " ");
				check++;
				if(check == 2) {
					newfile.println();
					check = 0;
				}
				i++;
			}
		}
		
		
		file.close();
		newfile.close();
	}
}
