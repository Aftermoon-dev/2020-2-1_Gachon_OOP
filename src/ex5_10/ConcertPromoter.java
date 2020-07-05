package ex5_10;

public class ConcertPromoter {
	private String name;
	private String venue;
	private int soldTicket;
	private int soldPhone;
	private int soldVenue;
	private double pricePhone;
	private double priceVenue;
	private double totalAmount;
	private int totalTicket;
	private int salesMethod;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}
	
	public void setTotalTicket(int ticket) {
		this.totalTicket = ticket;
	}
	
	public void setPricePhone(double price) {
		this.pricePhone = price;
	}
	
	public void setPriceVenue(double price) {
		this.priceVenue = price;
	}
	
	public void recordSales(int people) {
		if(getRemainingTicket() >= people) {
			if(salesMethod == 0) {
				totalAmount += (pricePhone * people);
				soldPhone += people;
			}
			else if(salesMethod == 1) {
				totalAmount += (priceVenue * people);
				soldVenue += people;
			}
			soldTicket += people;
			System.out.println("Remaining Seats : " + getRemainingTicket());
		}
		else {
			System.out.println("Ticket Sold Out!");
		}
	}
	
	public void setSalesMethod(int method) {
		// method 0 - Phone Sales
		// method 1 - Sales at the Concert Venue
		if(method == 0 || method == 1) this.salesMethod = method;
		else System.out.println("Invaild Method!");
	}
	
	public int getSoldTicket() {
		return soldTicket;
	}
	
	public int getRemainingTicket() {
		return totalTicket - soldTicket;
	}
	
	public double getTotalAmount() {
		return totalAmount;
	}
	
	public int getSoldPhone() {
		return soldPhone;
	}
	
	public int getSoldVenue() {
		return soldVenue;
	}
}
