package ex9_1b;

public class Doctor extends Person {
	private Specialty specialty;
	private double visit_fee;
	

	public Doctor() {
		super();
	}
	
	public Doctor(String name, Specialty specialty, double fee) {
		super(name);
		this.specialty = specialty;
		this.visit_fee = fee;
	}

	public Specialty getSpecialty() {
		return specialty;
	}

	public void setSpecialty(Specialty specialty) {
		this.specialty = specialty;
	}

	public double getVisitFee() {
		return visit_fee;
	}

	public void setVisitFee(double visit_fee) {
		if(visit_fee >= 1) this.visit_fee = visit_fee;
		else System.out.println("Visit Fee must be at least 1!");
	}
	
	public String toString() {
		return "Name : " + super.getName() + "\nSpecialty : " + this.specialty.toString() + "\nVisit Fee : " + this.visit_fee;
	}
	
	public boolean equals(Object object) {
		if(!(object != null && object instanceof Doctor)) return false;
		Doctor otherDoctor = (Doctor) object;
		return this.hasSameName(otherDoctor) && (this.specialty.equals(otherDoctor.specialty)) && (this.visit_fee == otherDoctor.visit_fee);
	}
}
