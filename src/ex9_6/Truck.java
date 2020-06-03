package ex9_6;

public class Truck extends Vehicle {
	private double loadCapacity;
	private double towingCapacity;
	
	public Truck(String manufacturer, int cylinders, double loadCapacity, double towingCapacity, Person owner) {
		super(manufacturer, cylinders, owner);
		this.loadCapacity = loadCapacity;
		this.towingCapacity = towingCapacity;
	}
	
	public double getLoadCapacity() {
		return loadCapacity;
	}

	public double getTowingCapacity() {
		return towingCapacity;
	}

	public boolean equals(Object object) {
		if(!(object != null && object instanceof Truck)) return false;
		Truck otherTruck = (Truck) object;
		return super.equals(object)
				&& (this.loadCapacity == otherTruck.loadCapacity)
				&& (this.towingCapacity == otherTruck.towingCapacity);
	}
}
