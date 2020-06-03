package ex9_10;

public class Student extends Person {
	private int studentNumber;
	
	public Student() {
        super();
        studentNumber = 0;
    }
    public Student(String initialName, int initialStudentNumber) {
        super(initialName);
        studentNumber = initialStudentNumber;
    }
    public void reset(String newName, int newStudentNumber) {
        setName(newName);
        studentNumber = newStudentNumber;
    }
    public int getStudentNumber() {
        return studentNumber;
    }
    public void setStudentNumber(int newStudentNumber) {
        studentNumber = newStudentNumber;
    }
    
    public void writeOutput() {
    	super.writeOutput();
    	System.out.println("Student Number : " + this.studentNumber);
    }
    
    public boolean equals(Student otherStudent) {
    	if(!(otherStudent != null && otherStudent instanceof Student)) return false;
    	return this.hasSameName(otherStudent) 
    			&& this.studentNumber == otherStudent.studentNumber;
    }
}
