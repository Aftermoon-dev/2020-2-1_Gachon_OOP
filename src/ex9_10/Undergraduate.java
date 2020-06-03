package ex9_10;

public class Undergraduate extends Student {
	private int level;
	
	public Undergraduate(String initialName, int initialStudentNumber, int level) {
		super(initialName, initialStudentNumber);
		this.level = level;
	}
	
	public void reset(String newName, int newStudentNumber, int newlevel) {
		super.reset(newName, newStudentNumber);
		this.level = newlevel;
	}
	
	public int getLevel() {
		return level;
	}
	
	public void setLevel(int level) {
		this.level = level;
	}
	
	public void writeOutput() {
		super.writeOutput();
		System.out.println("Level : " + level);
	}
	
	public boolean equals(Undergraduate otherUndergraduate) {
		if(!(otherUndergraduate != null && otherUndergraduate instanceof Undergraduate)) return false;
		return super.equals(otherUndergraduate) && this.level == otherUndergraduate.level;
	}
}
