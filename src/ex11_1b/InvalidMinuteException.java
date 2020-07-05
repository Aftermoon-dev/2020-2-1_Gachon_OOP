package ex11_1b;

public class InvalidMinuteException extends InvalidTimeException {
	public InvalidMinuteException() {
		super("Invalid Minute!");
	}
	
	public InvalidMinuteException(String msg) {
		super(msg);
	}
	
	public static boolean checkMinute(String minute) {
		if(minute == null || minute.isEmpty()) return false;
		
		if(minute.length() == 1 || minute.length() == 2) {
			int m = Integer.parseInt(minute);
			if(0 > m || m > 59) return false;
			
			return true;
		}
		else {
			return false;
		}
	}
}
