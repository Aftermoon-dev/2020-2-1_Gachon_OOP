package ex11_1b;

public class ex11_1b {
	public static void main(String[] args) throws InvalidHourException, InvalidMinuteException {
		String hourTest1 = "12";
		String hourTest2 = "15";
		String minuteTest1 = "35";
		String minuteTest2 = "68";
		
		if(!InvalidHourException.checkHour(hourTest1)) {
			throw new InvalidHourException();
		}
		else {
			System.out.println("true");
		}
		
		try {
			if(!InvalidHourException.checkHour(hourTest2)) {
				throw new InvalidHourException();
			}
			else {
				System.out.println("true");
			}
		}
		catch (InvalidHourException e) {
			e.printStackTrace();
		}
		
		
		
		if(!InvalidMinuteException.checkMinute(minuteTest1)) {
			throw new InvalidMinuteException();
		}
		else {
			System.out.println("true");
		}
		
		try {
			if(!InvalidMinuteException.checkMinute(minuteTest2)) {
				throw new InvalidMinuteException();
			}
			else {
				System.out.println("true");
			}
		}
		catch (InvalidMinuteException e) {
			e.printStackTrace();
		}
	}
}
