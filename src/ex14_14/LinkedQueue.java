package ex14_14;

import java.util.LinkedList;

public class LinkedQueue<T extends Object> extends LinkedList<Object> {
	private LinkedQueue<T> front;
	private int count;
	
	public LinkedQueue() {
		front = null;
		count = 0;
	}
	
	public void addToQueue(T item) {
		this.add(item);
		
		if(count == 0) {
			 front = this;
		}
		
		count++;
	}

	public Object removeFromQueue() {
		if(isEmpty()) return null;
		
		Object item = null;
		
		if(count > 0) {
			item = front.removeFirst();
			count--; 
		}
		
		return item;
	}
	
	public boolean isEmpty() {
		if(super.isEmpty() && count == 0) return true;
		else return false;
	}

}


