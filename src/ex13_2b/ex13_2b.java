package ex13_2b;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class ex13_2b {
	public static void main(String[] args) {
		int[] intArray = new int[10];
		ObjectOutputStream outputStream = null;
		ObjectInputStream inputStream = null;
		Scanner file = null;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please type File Name : ");
		String filename = keyboard.nextLine();
		System.out.print("Please type New File Name : ");
		String newfilename = keyboard.nextLine();
		keyboard.close();
		
		try {
			file = new Scanner(new File(filename));
		} catch (FileNotFoundException e) {
			System.out.println("Can't find File!");
			e.printStackTrace();
			System.exit(1);
		}
		
		int cnt = 0;
		while(file.hasNextLine()) {
			intArray[cnt] = Integer.parseInt(file.nextLine());
			cnt++;
			
			if(!file.hasNextInt()) break;
		}
		
		file.close();

		try {
			outputStream = new ObjectOutputStream(new FileOutputStream(newfilename));
			
			outputStream.writeInt(intArray[0]);
			for(int i = 0; i < 9; i++) {
				outputStream.writeByte(intArray[i+1] - intArray[i]);
			}
			outputStream.close();
			
			
			inputStream = new ObjectInputStream(new FileInputStream(newfilename));
			
			try {
				int beforeNum = inputStream.readInt();
				System.out.println(beforeNum);
				
				while (true) {
					byte b = inputStream.readByte();
					
					System.out.println(beforeNum + (b & 0xFF));
					beforeNum = beforeNum + (b & 0xFF);
				}
			}
			catch (EOFException e) {
				System.out.println("File END");
			}
			
			inputStream.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("Can't find File!");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
