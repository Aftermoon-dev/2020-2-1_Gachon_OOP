package ex6_10;

public class ex6_10 {
	public static void main(String[] args) {
		Temperature temp1 = new Temperature();
		Temperature temp2 = new Temperature(32.0, 'F');
		
		System.out.println(temp1.getCelsiusDegree() + " " + temp2.getFahrenheitDegree());
		System.out.println("Equals : " + temp1.equals(temp2));
		System.out.println("Temp1 is Greater Temp2 : " + temp1.isGreater(temp2));
		System.out.println("Temp1 is Less Temp2 : " + temp1.isLess(temp2));
		
		temp1.setDegrees(-40.0);
		temp2.setDegrees(-40.0);
		
		System.out.println(temp1.getCelsiusDegree() + " " + temp2.getFahrenheitDegree());
		System.out.println("Equals : " + temp1.equals(temp2));
		System.out.println("Temp1 is Greater Temp2 : " + temp1.isGreater(temp2));
		System.out.println("Temp1 is Less Temp2 : " + temp1.isLess(temp2));
		
		temp1.setDegrees(212.0);
		temp1.setScale('F');
		temp2.setTemperature(100.0, 'C');
		
		System.out.println(temp1.getFahrenheitDegree() + " " + temp2.getCelsiusDegree());
		System.out.println("Equals : " + temp1.equals(temp2));
		System.out.println("Temp1 is Greater Temp2 : " + temp1.isGreater(temp2));
		System.out.println("Temp1 is Less Temp2 : " + temp1.isLess(temp2));
		
	}
}
