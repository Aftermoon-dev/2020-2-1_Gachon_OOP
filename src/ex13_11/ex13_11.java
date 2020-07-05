package ex13_11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ex13_11 {
	public static void main(String[] args) {
		Scanner file = null;
		
		try {
			file = new Scanner(new File("words.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("Can't find words.txt!");
			e.printStackTrace();
			System.exit(1);
		}
		
		while(file.hasNextLine()) {
			String str = file.nextLine();
			if(str.endsWith("dous")) System.out.println(str);
		}
		
		file.close();
	}
}
