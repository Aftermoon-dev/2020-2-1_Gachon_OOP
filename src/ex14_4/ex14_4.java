package ex14_4;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class ex14_4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<Pet> petList = new ArrayList<Pet>();
		
		
		while(true) {
			System.out.print("Please enter Pet Name : ");
			String name = s.nextLine();
			
			System.out.print("Please enter Pet Age : ");
			int age = s.nextInt();
			
			System.out.print("Please enter Pet Weight : ");
			double weight = s.nextDouble();
			
			petList.add(new Pet(name, age, weight));
			
			s.nextLine();
			
			System.out.print("More? (y/n) : ");
			String next = s.nextLine();
			
			if(next.equalsIgnoreCase("n")) {
				break;
			}
			else if (next.equalsIgnoreCase("y")) {
				continue;
			}
		}
		
		Collections.sort(petList);
		
		for(Pet p : petList) {
			System.out.println("Pet Name : " + p.getName());
			System.out.println("Pet Age : " + p.getAge());
			System.out.println("Pet Weight : " + p.getWeight());
			System.out.println();
		}
		
		s.close();
	}
}
