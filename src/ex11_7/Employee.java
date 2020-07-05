package ex11_7;

import java.util.Scanner;

public class Employee extends Person {
	private double salary;
	private int ssn;
	
	public Employee(String name, double salary, int ssn) {
		super(name);
		this.salary = salary;
		this.ssn = ssn;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	
	public static Employee newEmployee(Scanner s) throws SSNLengthException, SSNCharacterException {
		System.out.print("\nPlease type a Employee's Name : ");
		String name = s.nextLine();
		System.out.print("Please type a Employee's Salary : ");
		double salary = s.nextDouble();
		s.nextLine();
		System.out.print("Please type a Employee's SSN (not include dash (-)) : ");
		String ssn = s.nextLine();
			
		try {
			if((int) Math.log10(Integer.valueOf(ssn)) + 1 != 9) {
				throw new SSNLengthException(String.valueOf(ssn));
			}
		}
		catch (NumberFormatException e) {

			throw new SSNCharacterException(String.valueOf(ssn));
		}
		
		return new Employee(name, salary, Integer.valueOf(ssn));
	}
	
	public void writeOutput() {
		super.writeOutput();
		System.out.println("Salary : " + this.salary);
		System.out.println("SSN : " + this.ssn);
	}
	
}
