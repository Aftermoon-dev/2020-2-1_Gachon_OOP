package ex14_18;

import java.util.HashMap;
import java.util.Scanner;

public class ex14_18 {
	public static void main(String[] args) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.print("Please enter Number (Exit : -1) : ");
			int i = s.nextInt();
			
			if(i == -1) break;
			
			if(map.get(i) != null) map.put(i, map.get(i)+1);
			else map.put(i, 1);
		}
		
		for(Integer key : map.keySet()) {
			System.out.println("The number " + key + " occurs " + map.get(key) + " times.");
		}
		s.close();
	}
}
