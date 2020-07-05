package ex14_14;

public class ex14_14 {
	public static void main(String[] args) {
		LinkedQueue<Integer> queue = new LinkedQueue<Integer>();
		
		System.out.println("Queue is Empty? : " + queue.isEmpty());
		
		for(int i = 0; i < 10; i++) {
			int random = (int) (Math.random() * 100);
			System.out.println("Added " + random);
			queue.addToQueue(random);
		}
	
		System.out.println("Queue is Empty? : " + queue.isEmpty());
		
		for(int i = 0; i < 11; i++) {
			System.out.println("Removed : " + queue.removeFromQueue());
		}
		
		System.out.println("Queue is Empty? : " + queue.isEmpty());
	}
}
