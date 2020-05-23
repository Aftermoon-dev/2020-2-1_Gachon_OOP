package ex6_2b;

public class Time {
	private int hour;
	private int minute;
	
	public Time(int hour, int minute) {
		if(isValid(hour, minute)) {
			this.hour = hour;
			this.minute = minute;
		}
		else {
			System.out.println("Not Valid (0~24 or 0~59)");
		}
	}
	
	public Time(int hour, int minute, boolean isPM) {
		if(hour < 13) {
			if(isPM) {
				this.hour = hour + 12;
			}
			else {
				this.hour = hour;
			}
			this.minute = minute;
		}
		else {
			System.out.println("Not Valid (0~12)");
		}
	}
	
	public static boolean isValid(int hour, int minute) {
		return ((0 <= hour) && (hour < 24)) && ((0 <= minute) && (minute < 60));
	}
	
	public String getTime24() {
		return String.format("%d%d", hour, minute);
	}
	
	public String getTime12() {
		String ap = "AM";
		int h = hour;
		
		if(13 <= hour) {
			ap = "PM";
			h -= 12;
		}
		
		return String.format("%d:%d %s", h, minute, ap);
		
	}
}
