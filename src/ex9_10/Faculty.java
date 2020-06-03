package ex9_10;

public class Faculty extends Employee {
	private String title;
	
	public Faculty(String initialName, int employeeID, String department, String title) {
		super(initialName, employeeID, department);
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public void writeOutput()
	{
		super.writeOutput();
		System.out.println("Title : " + this.title);
	}
}
