package ex14_2c;

import java.util.LinkedList;

public class ex14_2c {
	public static void main(String[] args) {
		String[] strList = { "Hello", "World", "Hello", "Java", "Programming", "Hello", "Hello" };
		
		LinkedList<String> list = arrayToLinkedList(strList);
		
		System.out.println("arrayToLinkedList Result : ");
		
		for(String s : list){
			System.out.println(s);
		}
		
		System.out.println("removeFromLinkedList Result : ");
		removeFromLinkedList(list, "Hello");
		for(String s : list){
			System.out.println(s);
		}
	}
	
	public static LinkedList<String> arrayToLinkedList(String[] s) {
		LinkedList<String> list = new LinkedList<String>();
		for(int i = 0; i < s.length; i++) {
			list.add(s[i]);
		}
		return list;
	}
	
	public static void removeFromLinkedList(LinkedList<String> list, String s) {
		while(list.contains(s)) {
			list.remove(s);
		}
	}
}
