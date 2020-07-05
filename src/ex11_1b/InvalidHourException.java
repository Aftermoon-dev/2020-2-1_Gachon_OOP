package ex11_1b;

public class InvalidHourException extends InvalidTimeException {
	public InvalidHourException() {
		super("Invalid Hour!");
	}
	
	public InvalidHourException(String msg) {
		super(msg);
	}
	
	public static boolean checkHour(String hour) {
		if(hour == null || hour.isEmpty()) return false;
		
		if(hour.length() == 1 || hour.length() == 2) {
			int h = Integer.parseInt(hour);
			if(0 > h || h > 12) return false;
			
			return true;
		}
		else {
			return false;
		}
	}
}
