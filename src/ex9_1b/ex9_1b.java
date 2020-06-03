package ex9_1b;

public class ex9_1b {
	public static void main(String[] args) {
		Person person = new Person("Brad Lee");
		Doctor doc1 = new Doctor("James Kim", Specialty.Surgery, 100.0);
		Doctor doc2 = new Doctor();
		doc2.setName("Chris Park");
		doc2.setSpecialty(Specialty.Dentist);
		doc2.setVisitFee(150.0);
		
		System.out.println(doc1.toString());
		System.out.println(doc2.toString());
		System.out.println(doc1.equals(doc2));
		System.out.println(doc1.equals(person));
	}
}
