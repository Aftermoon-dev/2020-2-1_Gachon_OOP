package ex7_2a;

public class SelectionSortDemo {
	public static void main(String[] args) {
		int[] a = {30, 23, 17, 3, 1, 2, 9, 38, 27};
		int[] b = {7, 5, 11, 2, 16, 4, 18, 14, 12, 30};
		int[] c = {123, 24, 37, 12934, 458, 769, 427};
		
		System.out.println("\nA");
		
		display(a, "before");
		ArraySorter.selectionSort(a);
		display(a, "after");
		
		System.out.println("\nB");
		
		display(b, "before");
		ArraySorter.selectionSort(b);
		display(b, "after");
		
		System.out.println("\nC");
		
		display(c, "before");
		ArraySorter.selectionSort(c);
		display(c, "after");
	}
	
	public static void display(int[] array, String when) {
		System.out.println("Array values " + when + " sorting:");
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
		System.out.println( );
	}
}
