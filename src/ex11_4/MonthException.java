package ex11_4;

public class MonthException extends Exception {
	public MonthException() {
		super("Month is Invaild!");
	}
	
	public MonthException(String msg) {
		super(msg);
	}
}
