package ex11_1a;

public class ex11_1a {
	public static void main(String[] args) throws InvalidTimeException {
		String test1 = "12:30 pm";
		String test2 = "13:00 am";
		
		if(InvalidTimeException.checkTime(test1) == false) {
			throw new InvalidTimeException();
		}
		else {
			System.out.println("true");
		}
		
		
		if(InvalidTimeException.checkTime(test2) == false) {
			throw new InvalidTimeException();
		}
		else {
			System.out.println("true");
		}
	}
}
