package ders02;
/*
BAŞLA

Dizi A[0..n-1]

FOR i = 0 TO n
	OKU Dizi[i]
END FOR

FOR i = 0 TO n-2

    minIndex = i

    FOR j = i+1 TO n-1
        IF A[j] < A[minIndex] İSE
            minIndex = j
        END IF
    END FOR

    // Yer değiştirme (swap)
    temp = A[i]
    A[i] = A[minIndex]
    A[minIndex] = temp

SON

DUR
* */
/*
PROSEDÜR GetIndexOfMin(A, baslangic, bitis)
    enKucukIndeks = baslangic

    FOR j = baslangic + 1 TO bitis:
        EĞER A[j] < A[enKucukIndeks] İSE:
            enKucukIndeks = j
        END EGER
    END FOR

    DÖNDÜR enKucukIndeks
BİTTİ

PROSEDÜR Swap(A, i, j)
    temp = A[i]
    A[i] = A[j]
    A[j] = gecici
BİTTİ

PROSEDÜR SelectionSort(A, n)

    FOR i = 0 TO n-2:

        minIndeks = GetIndexOfMin(A, i, n-1)
        Swap(A, i, minIndeks)

    END FOR

BİTTİ
* */

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
