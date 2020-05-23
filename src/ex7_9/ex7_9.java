package ex7_9;

import java.util.Scanner;

public class ex7_9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] password = {0, 0, 5, 1, 3};
		int[] randomNum = new int[10];
		int[] enterNum = new int[password.length];
		
		for(int i = 0; i < 10; i++) {
			randomNum[i] = (int) (Math.random() * 3) + 1;
		}
		
		
		System.out.print("PIN : ");
		for(int i = 0; i < 10; i++) {
			System.out.print(i + " ");
		}
		
		System.out.print("\nNUM : ");
		for(int i = 0; i < 10; i++) {
			System.out.print(randomNum[i] + " ");
		}
		
		System.out.print("\nPlease Enter Code : ");
		String code = scanner.nextLine();
		
		for(int i = 0; i < password.length; i++) {
			enterNum[i] = Integer.parseInt(Character.toString(code.charAt(i)));
		}
		
		if(isValid(password, randomNum, enterNum)) {
			System.out.println("Correct!");
		}
		else {
			System.out.println("Not Correct.");
		}
		
		scanner.close();
	}
	
	public static boolean isValid(int[] password, int[] randomNum, int[] enterNum) {
		int i = 0;
		boolean check = true;
		while(i < password.length) {
			
			if(enterNum[i] != randomNum[password[i]]) {
				check = false;
				break;
			}
			i++;
		}
		return check;
	}
	
}
