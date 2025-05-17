package ders02.diziler;

public class ArraySorterDemo {

	public static void main(String[] args) {
		int[] arr = { 7, 5, 11, 2, 16, 4, 18, 14, 12, 30 };
		display(arr, "before");
//		ArraySorter.selectionSort(arr);
		ArraySorter obj = new ArraySorter();
		obj.selectionSort(arr);
		display(arr, "after");
	}

	public static void display(int[] array, String when) {
		System.out.println("Array values " + when + " sorting:");
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
		System.out.println();

	}

}
