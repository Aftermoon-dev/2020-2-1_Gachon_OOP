package ex6_1b;

public class ex6_1b {
	public static void main(String[] args) {
		RoomOccupancy r1 = new RoomOccupancy(101, 5);
		RoomOccupancy r2 = new RoomOccupancy(102, 3);
		RoomOccupancy r3 = new RoomOccupancy(103, 2);
		
		System.out.println("Room 1 : " + r1.getNumber());
		System.out.println("Room 2 : " + r2.getNumber());
		System.out.println("Room 3 : " + r3.getNumber());
		System.out.println("Total Number : " + RoomOccupancy.getTotal());
		
		r1.removeOneFromRoom();
		r2.addOneToRoom();
		r3.addOneToRoom();
		r2.removeOneFromRoom();
		
		System.out.println("Room 1 : " + r1.getNumber());
		System.out.println("Room 2 : " + r2.getNumber());
		System.out.println("Room 3 : " + r3.getNumber());
		System.out.println("Total Number : " + RoomOccupancy.getTotal());
	}
}
