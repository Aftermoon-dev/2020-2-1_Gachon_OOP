package ex14_1a;

import java.util.ArrayList;

public class ex14_1a {
	public static void main(String[] args) {
		String[] strList = { "Hello", "World", "Hello", "Java", "Programming", "Hello", "Hello" };
		
		ArrayList<String> list = arrayToArrayList(strList);
		
		System.out.println("arrayToArrayList Result : ");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		removeFromArrayList(list, "Hello");
		
		System.out.println("\nremoveFromArrayList Result : ");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	
	public static ArrayList<String> arrayToArrayList(String[] s) {
		ArrayList<String> list = new ArrayList<String>();
		for(int i = 0; i < s.length; i++) {
			list.add(s[i]);
		}
		return list;
	}
	
	public static void removeFromArrayList(ArrayList<String> list, String s) {
		while(list.contains(s)) {
			list.remove(s);
		}
	}
}
