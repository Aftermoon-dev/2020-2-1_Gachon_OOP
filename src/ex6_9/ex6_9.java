package ex6_9;

public class ex6_9 {
	public static void main(String[] args) {
		Person p0 = Person.createAdult();
		Person p1 = Person.createToddler();
		Person p2 = Person.createPreschooler();
		Person p3 = Person.createAdolescent();
		Person p4 = Person.createTeenager();	
		
		System.out.println(p0.getName() + " " + p0.getAge());
		System.out.println(p1.getName() + " " + p1.getAge());
		System.out.println(p2.getName() + " " + p2.getAge());
		System.out.println(p3.getName() + " " + p3.getAge());
		System.out.println(p4.getName() + " " + p4.getAge());
		
		
		Person p5 = new Person();
		System.out.println(p5.getName() + " " + p5.getAge());
		
		p5.setName("James", "Park");
		p5.setAge(32);
		
		System.out.println(p5.getName() + " " + p5.getAge());
		
		p5.setName("James Kim");
		
		System.out.println(p5.getName() + " " + p5.getAge());
		
		Person p6 = new Person("Tony Stark", 49);
		
		System.out.println(p6.getName() + " " + p6.getAge());
	}
}
