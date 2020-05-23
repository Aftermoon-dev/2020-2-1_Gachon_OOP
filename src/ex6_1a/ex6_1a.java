package ex6_1a;

public class ex6_1a {
	public static void main(String[] args) {
		Time time = new Time();
		
		time.setTime(12, 59);
		System.out.println("Hour : " + time.getHour() + " Minute : " + time.getMinute());
		
		time.setTime2(11, 50, true);
		System.out.println("Hour : " + time.getHour() + " Minute : " + time.getMinute());
		
	}
}
