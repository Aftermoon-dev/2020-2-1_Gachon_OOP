package ex13_7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ex13_7 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		String message = "";
		Scanner keyboard = new Scanner(System.in);
		Scanner messageFile = null;
		Scanner file = null;
		PrintWriter outputStream = null;
		
		System.out.print("Please type Message Text File Name : ");
		String messageText = keyboard.nextLine();
		
		System.out.print("Please type New Text File Name : ");
		String newMessage = keyboard.nextLine();
		keyboard.close();
		
		try {
			file = new Scanner(new File("abbreviations.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("Can't find abbreviations.txt!");
			e.printStackTrace();
			System.exit(1);
		}
		
		while(file.hasNextLine()) {
			list.add(file.nextLine());
		}
		
		file.close();
		
		try {
			messageFile = new Scanner(new File(messageText));
		} catch (FileNotFoundException e) {
			System.out.println("Can't find " + messageText);
			e.printStackTrace();
			System.exit(1);
		}
		
		while(messageFile.hasNextLine()) {
			message = messageFile.nextLine();
		}
		
		messageFile.close();
		
		for(int i = 0; i < list.size(); i++) {
			if(message.toLowerCase().contains(list.get(i))) {
				int startidx = message.toLowerCase().indexOf(list.get(i));
				int endidx = startidx+list.get(i).length();
				
				String start = message.substring(0, startidx-1);
				String target = " <" + message.substring(startidx, endidx) + ">";
				String end = message.substring(endidx);
				
				message = start + target + end;
			}
		}
		
		try {
			outputStream = new PrintWriter(newMessage);
		} catch (FileNotFoundException e) {
			System.out.println("Can't find File!");
			e.printStackTrace();
			System.exit(1);
		}

 		outputStream.print(message);
		
		outputStream.close();
	}
}
