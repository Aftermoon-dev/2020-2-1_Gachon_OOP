package ex6_9;

public class Person {
	private String name;
	private int age;
	
	public Person() {
		this.name = "No name yet";
		this.age = 0;
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public static Person createAdult() {
		return new Person("An adult", 21);
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setName(String first, String last) {
		this.name = first + " " + last;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public static Person createToddler() {
		Person p = new Person();
		p.setName("A toddler");
		p.setAge(2);
		return p;
	}
	
	public static Person createPreschooler() {
		Person p = new Person();
		p.setName("A pre-schooler");
		p.setAge(5);
		return p;
	}
	
	public static Person createAdolescent() {
		Person p = new Person();
		p.setName("An adolescent");
		p.setAge(9);
		return p;
	}
	
	public static Person createTeenager() {
		Person p = new Person();
		p.setName("A teenager");
		p.setAge(15);
		return p;
	}
}
