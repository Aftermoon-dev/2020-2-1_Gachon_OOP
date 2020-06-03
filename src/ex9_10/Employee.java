package ex9_10;

public class Employee extends Person {
	private int employeeID;
	private String department;
	
	public Employee(String initialName, int employeeID, String department) {
		super(initialName);
		this.employeeID = employeeID;
		this.department = department;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	public void writeOutput()
	{
		super.writeOutput();
		System.out.println("Employee ID : " + this.employeeID);
		System.out.println("Department : " + this.department);
	}
}
