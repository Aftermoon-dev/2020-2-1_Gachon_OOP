package ex11_4;

public class DayException extends Exception {
	public DayException() {
		super("Day is Invaild!");
	}
	
	public DayException(String msg) {
		super(msg);
	}
}
