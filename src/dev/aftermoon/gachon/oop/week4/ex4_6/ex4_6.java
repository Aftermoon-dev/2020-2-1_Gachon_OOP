package dev.aftermoon.gachon.oop.week4.ex4_6;

public class ex4_6 {
	public static void main(String[] args) {
		Purchase oranges = new Purchase();
		Purchase eggs = new Purchase();
		Purchase apples = new Purchase();
		Purchase watermelons = new Purchase();
		Purchase bagels = new Purchase();
		
		oranges.setName("Oranges");
		eggs.setName("Eggs");
		apples.setName("Apples");
		watermelons.setName("Wateermelons");
		bagels.setName("Bagels");
		
		oranges.setPrice(10, 2.99);
		eggs.setPrice(12, 1.69);
		apples.setPrice(3, 1.00);
		watermelons.setPrice(1, 4.39);
		bagels.setPrice(6, 3.50);
		
		oranges.setNumberBought(24);
		eggs.setNumberBought(36);
		apples.setNumberBought(20);
		watermelons.setNumberBought(2);
		bagels.setNumberBought(12);
		
		double price = oranges.getTotalCost() + eggs.getTotalCost() + apples.getTotalCost() + watermelons.getTotalCost() + bagels.getTotalCost();
		System.out.println("Total Bill : $" + price);
	}
}
