package ex9_6;

public class Vehicle {
	private String manufacturer;
	private int cylinders;
	private Person owner;
	
	public Vehicle(String manufacturer, int cylinders, Person owner) {
		this.manufacturer = manufacturer;
		this.cylinders = cylinders;
		this.owner = owner;
	}
	
	public String getManufacturer() {
		return manufacturer;
	}
	public int getCylinders() {
		return cylinders;
	}
	public Person getOwner() {
		return owner;
	}
	
	public boolean equals(Object object) {
		if(!(object != null && object instanceof Vehicle)) return false;
		Vehicle otherVehicle = (Vehicle) object;
		return this.manufacturer.equals(otherVehicle.manufacturer) 
				&& (this.cylinders == otherVehicle.cylinders)
				&& (this.owner.hasSameName(otherVehicle.getOwner()));
	}
}
