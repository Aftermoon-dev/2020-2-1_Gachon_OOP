package ex14_2b;

import java.util.HashSet;

public class ex14_2b {
	public static void main(String[] args) {
		String[] strList = { "Hello", "World", "Hello", "Java", "Programming", "Hello", "Hello" };
		HashSet<String> strSet = arrayToHashSet(strList);
		
		System.out.println("arrayToHashSet Result : ");
		for(String j : strSet) {
			System.out.println(j);
		}
		
		removeFromHashSet(strSet, "Java");
		System.out.println("removeFromHashSet Result : ");
		for(String j : strSet) {
			System.out.println(j);
		}
	}
	
	public static HashSet<String> arrayToHashSet(String[] s) {
		HashSet<String> set = new HashSet<String>();
		for(int i = 0; i < s.length; i++) {
			set.add(s[i]);
		}
		return set;
	}
	
	public static void removeFromHashSet(HashSet<String> set, String s) {
		while(set.contains(s)) {
			set.remove(s);
		}
	}
}
