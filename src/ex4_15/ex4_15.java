package ex4_15;

public class ex4_15 {
	public static void main(String[] args) {
		int[] num = new int[3];
		
		for(int i = 0; i < 3; i++) {
			num[i] = (int) (Math.random() * 10) + 1;
			
			for(int j = 0; j < i; j++) {
				if(num[j] == num[i]) {
					i--;
					break;
				}
			}
		}
		
		System.out.print("Selected Number : ");
		for(int i = 0; i < 3; i++) {
			System.out.print(num[i] + " ");
		}
	}
}
