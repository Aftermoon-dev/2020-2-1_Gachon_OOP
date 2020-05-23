package ex7_1b;

import java.util.Scanner;

public class ex7_1b {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			int[] frequency = new int[10];
			String pNum;
			System.out.print("Please type a phone Number (Exit : -1) : ");
			pNum = scanner.nextLine();
			
			if(pNum.equals("-1")) break;
			
			pNum = pNum.replace("-", "");
			
			for(int i = 0; i < pNum.length(); i++) {
				int idx = Integer.parseInt(Character.toString(pNum.charAt(i)));
				frequency[idx]++;
			}
			
			for(int i = 0; i < 10; i++) {
				System.out.println("f[" + i + "] = " + frequency[i]);
			}
		}
		scanner.close();
	}
}
