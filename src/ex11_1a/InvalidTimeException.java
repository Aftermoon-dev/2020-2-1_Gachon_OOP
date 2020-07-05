package ex11_1a;

public class InvalidTimeException extends Exception {
	public InvalidTimeException() {
		super("Invalid Time!");
	}
	
	public InvalidTimeException(String msg) {
		super(msg);
	}
	
	public static boolean checkTime(String t) {
		if(t == null || t.isEmpty()) return false;
		
		if(t.length() == 6 || t.length() == 7 || t.length() == 8) {
			try {
				int hour = Integer.parseInt(t.substring(0, t.indexOf(":")));
				int minute = Integer.parseInt(t.substring(t.indexOf(":") + 1, t.indexOf(" ")));
				String ampm = t.substring(t.indexOf(" ")+1);
				
				if(0 > hour || hour > 12) return false;
				if(0 > minute || minute > 59) return false;
				if(!(ampm.equals("am") || ampm.equals("pm"))) return false;
			}
			catch (Exception e) {
				return false;
			}
			
			return true;
		}
		else {
			return false;
		}
	}
}
