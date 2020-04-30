package dev.aftermoon.gachon.oop.week4.ex4_2b;

public class Counter {
	private int count;

	public int getCount() {
		return count;
	}
	
	public void resetCount() {
		count = 0;
	}
	
	public void increaseCount() {
		count++;
	}
	
	public void decreaseCount() {
		if(count > 0) {
			count--;
		}
		else {
			System.out.println("Error! Count cannot be less than 0!");
		}
	}
}
