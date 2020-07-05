package ex11_7;

import java.util.Scanner;

public class ex11_7 {
	public static void main(String[] args) throws SSNCharacterException, SSNLengthException {
		Scanner s = new Scanner(System.in);
		Employee[] emp = new Employee[100];
		double avg = 0;
		int current = 0;
		
		while(true) {
			try {
				emp[current] = Employee.newEmployee(s);
			} catch (SSNLengthException e) {
				System.out.println("SSN only 9 digits. Your Input : " + e.getMessage());
				System.out.print("Retry? (y/n) : ");
				String yn = s.nextLine();
				if(yn.equals("n")) break;
				else continue;
			} catch (SSNCharacterException e) {
				System.out.println("SSN only Integer. Your Input : " + e.getMessage());
				System.out.print("Retry? (y/n) : ");
				String yn = s.nextLine();
				if(yn.equals("n")) break;
				else continue;
			}
			
			avg += emp[current].getSalary();
			
			if(current+1 >= 100) break;
			
			System.out.print("More? (y/n) : ");
			String more = s.nextLine();
			
			if(more.equals("n")) {
				break;
			}
			else {
				current++;
			}
		}
		
		s.close();
		
		avg /= current;
			
		System.out.println("Salary Average : " + avg);
		for(int i = 0; i <= current; i++) {
			emp[i].writeOutput();
				
			if(emp[i].getSalary() >= avg) {
				System.out.println("Employee " + i + "'s Salary is Above average");
			}
			else {
				System.out.println("Employee " + i + "'s Salary is Below average");
			}
		}
	}
}
