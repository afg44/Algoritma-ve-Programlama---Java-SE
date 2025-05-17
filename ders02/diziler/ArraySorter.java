package ders02.diziler;

public class ArraySorter {
	/**
	 * Precondition: Every element in anArray has a value. Action: Sorts the array
	 * into ascending order.
	 */
	public  void selectionSort(int[] anArray) {
		for (int index = 0; index < anArray.length - 1; index++) {
			int indexOfNextSmallest = getIndexOfSmallest(index, anArray);
			swap(index, indexOfNextSmallest, anArray);
		}
	}

	/**
	 * Precondition: i and j are valid indices for the array a. Postcondition:
	 * Values of a[i] and a[j] have been interchanged.
	 */
	private static void swap(int i, int j, int[] a) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp; // original value of a[i]
	}

	private static int getIndexOfSmallest(int startIndex, int[] a) {
		int min = a[startIndex];
		int indexOfMin = startIndex;
		for (int index = startIndex + 1; index < a.length; index++) {
			if (a[index] < min) {
				min = a[index];
				indexOfMin = index;
				// min is smallest of a[startIndex] through a[index]
			}
		}
		return indexOfMin;
	}

}
