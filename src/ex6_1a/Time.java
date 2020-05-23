package ex6_1a;

public class Time {
	private int hour;
	private int minute;
	
	public Time() {
		hour = 0;
		minute = 0;
	}
	
	public static boolean isValid(int hour, int minute) {
		return ((0 <= hour) && (hour < 24)) && ((0 <= minute) && (minute < 60));
	}
	
	public void setTime(int hour, int minute) {
		if(isValid(hour, minute)) {
			this.hour = hour;
			this.minute = minute;
		}
		else {
			System.out.println("Not Valid (0~24 or 0~59)");
		}
	}
	
	public void setTime2(int hour, int minute, boolean isPM) {
		if(hour < 13) {
			if(isPM) {
				setTime(hour + 12, minute);
			}
			else {
				setTime(hour, minute);
			}
		}
		else {
			System.out.println("Not Valid (0~12)");
		}
	}
	
	public int getHour() {
		return this.hour;
	}
	
	public int getMinute() {
		return this.minute;
	}
}
