package ex13_2;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ex13_2 {
	public static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList<Integer>();
		Scanner keyboard = new Scanner(System.in);
		Scanner file = null;
		PrintWriter txtoutputStream = null;
		
		System.out.print("Please type Number Txt File Name : ");
		String numberFile = keyboard.nextLine();
		System.out.print("Please type New Txt File Name : ");
		String txtFile = keyboard.nextLine();
		
		keyboard.close();
		
		try {
			file = new Scanner(new File(numberFile));
		} catch (FileNotFoundException e) {
			System.out.println("Can't find File!");
			e.printStackTrace();
			System.exit(1);
		}
		
		while(file.hasNextLine()) {
			int num = Integer.parseInt(file.nextLine());
			if(!intList.contains(num)) {
				intList.add(num);
			}
		}
		
		file.close();

		try {
			txtoutputStream = new PrintWriter(txtFile);
		} catch (FileNotFoundException e) {
			System.out.println("Can't find File!");
			e.printStackTrace();
			System.exit(1);
		}
		
		for(int i = 0; i < intList.size(); i++) {
			txtoutputStream.append(intList.get(i) + "\n");
		}
		
		txtoutputStream.close();
	}
}
