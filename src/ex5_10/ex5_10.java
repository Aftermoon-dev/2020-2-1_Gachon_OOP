package ex5_10;

import java.util.Scanner;

public class ex5_10 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ConcertPromoter cp = new ConcertPromoter();
		cp.setName("Singer Concert");
		cp.setVenue("KSPO DOME");
		cp.setPricePhone(100.50);
		cp.setPriceVenue(100.00);
		cp.setTotalTicket(10);
		
		System.out.println("Tickets : " + cp.getRemainingTicket());
		
		System.out.println("Phone Sales - 8 tickets");
		cp.setSalesMethod(0);
		cp.recordSales(8);
		
		System.out.println("Venue Sales - 1 ticket");
		cp.setSalesMethod(1);
		cp.recordSales(1);;
		
		System.out.println("\nSold : " + cp.getSoldTicket() + " / Total Sales Amount : " + cp.getTotalAmount());
	}
}
