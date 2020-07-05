package ex13_12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ex13_12 {
	public static void main(String[] args) {
		int cnt1 = 0, cnt2 = 0;
		double avg1 = 0, avg2 = 0;
		ArrayList<int[]> list = new ArrayList<int[]>();
		Scanner file = null;
		
		try {
			file = new Scanner(new File("haberman.data"));
		} catch (FileNotFoundException e) {
			System.out.println("Can't find haberman.data!");
			e.printStackTrace();
			System.exit(1);
		}
		
		while(file.hasNextLine()) {
			String[] sList = file.nextLine().split(",");
			int[] integerList = new int[sList.length];
			for(int i = 0; i < sList.length; i++) {
				integerList[i] = Integer.parseInt(sList[i]);
			}
			list.add(integerList);
		}
		
		file.close();
		
		for(int i = 0; i < list.size(); i++) {
			int[] data = list.get(i);
			
			if(data[3] == 1) {
				avg1 += data[2];
				cnt1++;
			}
			
			if(data[3] == 2) {
				avg2 += data[2];
				cnt2++;
			}
		}
		
		avg1 = avg1 / cnt1;
		avg2 = avg2 / cnt2;
		
		System.out.println("Average Number of Positive Axillary nodes detected for patients who survived 5 years or longer : " + avg1);
		System.out.println("Average Number of Positive Axillary nodes detected for patients who died within 5 years : " + avg2);
	}
}
