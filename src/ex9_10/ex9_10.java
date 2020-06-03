package ex9_10;

public class ex9_10 {
	public static void main(String[] args)
	{
		Person[] people = new Person[6];
		people[0] = new Undergraduate("Cotty, Manny", 4910, 1);
		people[1] = new Undergraduate("Kick, Anita", 9931, 2);
		people[2] = new Student("DeBanque, Robin", 8812);
		people[3] = new Undergraduate("Bugg, June", 9901, 4);
		people[4] = new Faculty("James, Kim", 1324, "Department of Software", "Professor of Software");
		people[5] = new Staff("Juhyeon, Park", 4457, "Department of Infomation", 10);
		
		for (Person p : people)
		{
			p.writeOutput();
			System.out.println();
		}
	}
}
