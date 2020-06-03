package ex9_10;

public class Staff extends Employee {
	private int payGrade;
	
	public Staff(String initialName, int employeeID, String department, int payGrade) {
		super(initialName, employeeID, department);
		this.payGrade = payGrade;
	}

	public int getPayGrade() {
		return payGrade;
	}

	public void setPayGrade(int payGrade) {
		if(1 <= payGrade && payGrade <= 20) this.payGrade = payGrade;
		else System.out.println("Pay Grade can only 1~20");
	}
	
	public void writeOutput()
	{
		super.writeOutput();
		System.out.println("Pay Grade : " + this.payGrade);
	}
}
