package ex11_4;

import java.util.Scanner;
public class ex11_4 {
	public static void main(String[] args) throws DayException, MonthException {
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.print("Please type a date (ex. 01/31) : ");
			String date = s.nextLine();
			String option;
			
			int month = Integer.parseInt(date.substring(0, date.indexOf("/")));
			int day = Integer.parseInt(date.substring(date.indexOf("/") + 1));
			
			if(0 > month || month > 12) {
				throw new MonthException();
			}
			
			if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
				if(0 > day || day > 31) {
					throw new DayException();
				}
			}
			else if(month == 4 || month == 6 || month == 9 || month == 11) {
				if(0 > day || day > 30) {
					throw new DayException();
				}
			}
			else if(month == 2) {
				if(0 > day || day > 28) {
					throw new DayException();
				}
			}
			
			String[] mStr = {"January", "Feburary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
			
			System.out.println(mStr[month-1] + " " + day);
			System.out.println("Again? (y/n)");
			option = s.nextLine();
			
			if(option.equals("n")) break;
		}
		s.close();
	}
}
