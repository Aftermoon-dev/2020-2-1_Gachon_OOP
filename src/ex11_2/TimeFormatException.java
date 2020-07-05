package ex11_2;

public class TimeFormatException extends Exception{
	public TimeFormatException() {
		super("Time Format Error!");
	}
	
	public TimeFormatException(String msg) {
		super(msg);
	}
}
