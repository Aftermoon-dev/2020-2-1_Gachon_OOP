package ex11_2;

import java.util.Scanner;

public class ex11_2 {
	public static void main(String[] args) throws TimeFormatException {
		Scanner s = new Scanner(System.in);
		
		while(true) {
			String time;
			String option;
			System.out.print("Enter time in 24-hour notation : ");
			time = s.nextLine();
			
			int hour = Integer.parseInt(time.substring(0, time.indexOf(":")));
			int minute = Integer.parseInt(time.substring(time.indexOf(":") + 1));
			
			try {
				if(hour < 0 || hour > 23) {
					throw new TimeFormatException("Hour Error!");
				}
				
				if(minute < 0 || minute > 60) {
					throw new TimeFormatException("Minute Error!");
				}
			}
			catch (TimeFormatException e) {
				System.out.println("Time Format Error - " + e.getMessage());
				continue;
			}
			
			boolean isPM = false;
			if(hour >= 12) {
				isPM = true;
				if(hour > 12) hour -= 12;
			}
			
			System.out.println("That is the same as");
			System.out.print(hour + ":" + String.format("%02d", minute));
			if(isPM) System.out.println(" PM");
			else System.out.println(" AM");
			System.out.println("Again? (y/n)");
			option = s.nextLine();
			
			if(option.equals("n")) break;
		}
	}
}
