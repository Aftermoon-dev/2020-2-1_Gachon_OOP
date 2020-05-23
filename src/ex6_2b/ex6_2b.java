package ex6_2b;

public class ex6_2b {
	public static void main(String[] args) {
		Time time1 = new Time(12, 30);
		Time time2 = new Time(12, 20, true);
		
		System.out.println(time1.getTime12());
		System.out.println(time1.getTime24());
		System.out.println(time2.getTime12());
		System.out.println(time2.getTime24());
	}
}
