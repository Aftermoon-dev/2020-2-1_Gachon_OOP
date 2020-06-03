package ex9_6;

public class ex9_6 {
	public static void main(String[] args) {
		Person p1 = new Person("James Kim");
		Person p2 = new Person("Juhyeon Park");
		
		Truck t1 = new Truck("KIA", 3, 8.0, 10.0, p1);
		Truck t2 = new Truck("Mercedes-Benz", 5, 5.0, 8.0, p2);
		Truck t3 = new Truck("Mercedes-Benz", 5, 5.0, 8.0, p2);
		
		System.out.println("Truck 1");
		System.out.println("Manufacturer : " + t1.getManufacturer());
		System.out.println("Cylinders : " + t1.getCylinders());
		System.out.println("Owner Name : " + t1.getOwner().getName());
		System.out.println("Load Capacity (in tons) : " + t1.getLoadCapacity());
		System.out.println("Towing Capacity (in tons) : " + t1.getTowingCapacity());
		
		System.out.println("\nTruck 2");
		System.out.println("Manufacturer : " + t2.getManufacturer());
		System.out.println("Cylinders : " + t2.getCylinders());
		System.out.println("Owner Name : " + t2.getOwner().getName());
		System.out.println("Load Capacity (in tons) : " + t2.getLoadCapacity());
		System.out.println("Towing Capacity (in tons) : " + t2.getTowingCapacity());
		
		System.out.println("\nTruck 3");
		System.out.println("Manufacturer : " + t3.getManufacturer());
		System.out.println("Cylinders : " + t3.getCylinders());
		System.out.println("Owner Name : " + t3.getOwner().getName());
		System.out.println("Load Capacity (in tons) : " + t3.getLoadCapacity());
		System.out.println("Towing Capacity (in tons) : " + t3.getTowingCapacity());
		
		System.out.println("\nTruck 1 Equals Truck 2 : " + t1.equals(t2));
		System.out.println("Truck 2 Equals Truck 3 : " + t2.equals(t3));
		
	}
}
