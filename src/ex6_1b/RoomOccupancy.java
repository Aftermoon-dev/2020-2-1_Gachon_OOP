package ex6_1b;

public class RoomOccupancy {
	private int roomNumber;
	private int peopleInRoom;
	private static int totalNumber;
	
	public RoomOccupancy(int roomNumber, int peopleInRoom) {
		this.roomNumber = roomNumber;
		this.peopleInRoom = peopleInRoom;
		totalNumber += peopleInRoom;
	}
	
	public void addOneToRoom() {
		peopleInRoom++;
		totalNumber++;
	}
	
	public void removeOneFromRoom() {
		if(peopleInRoom > 0 && totalNumber > 0) {
			peopleInRoom--;
			totalNumber--;
		}
	}
	
	public int getNumber() {
		return roomNumber;
	}
	
	public static int getTotal() {
		return totalNumber;
	}
}
