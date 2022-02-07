package com.ds.sorting;

/*Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements 
 * if they are in wrong order. Time complexcity is O(n2).Worst and Average Case Time Complexity: O(n*n). Worst case occurs when array is reverse sorted.

Best Case Time Complexity: O(n). Best case occurs when array is already sorted.*/
public class BubbleSort {
	public static void main(String[] args) {
		int unsortedArr[] = { 1, 5, 4, 2, 8 };
		int sortedArr[] = bubbleSort(unsortedArr);
		System.out.println("The Result Array is:");
		for (int i = 0; i < sortedArr.length; i++) {
			System.out.print(sortedArr[i] + " ");
		}
	}

	public static int[] bubbleSort(int unsortedArr[]) {
		boolean swapped = false;
		for (int i = 0; i < unsortedArr.length - 1; i++) {
			for (int j = 0; j < unsortedArr.length - i - 1; j++) {
				if (unsortedArr[j] > unsortedArr[j + 1]) {
					swap(unsortedArr, j, j + 1);
					swapped = true;
				}
			}
			if(!swapped)
				break;
		}

		return unsortedArr;
	}

	private static void swap(int unsortedArr[], int i, int j) {
		int temp = unsortedArr[i];
		unsortedArr[i] = unsortedArr[j];
		unsortedArr[j] = temp;
	}
}
/*
 * Example: First Pass: ( 5 1 4 2 8 ) �> ( 1 5 4 2 8 ), Here, algorithm compares
 * the first two elements, and swaps since 5 > 1. ( 1 5 4 2 8 ) �> ( 1 4 5 2 8
 * ), Swap since 5 > 4 ( 1 4 5 2 8 ) �> ( 1 4 2 5 8 ), Swap since 5 > 2 ( 1 4 2
 * 5 8 ) �> ( 1 4 2 5 8 ), Now, since these elements are already in order (8 >
 * 5), algorithm does not swap them.
 * 
 * Second Pass: ( 1 4 2 5 8 ) �> ( 1 4 2 5 8 ) ( 1 4 2 5 8 ) �> ( 1 2 4 5 8 ),
 * Swap since 4 > 2 ( 1 2 4 5 8 ) �> ( 1 2 4 5 8 ) ( 1 2 4 5 8 ) �> ( 1 2 4 5 8
 * ) Now, the array is already sorted, but our algorithm does not know if it is
 * completed. The algorithm needs one whole pass without any swap to know it is
 * sorted.
 * 
 * Third Pass: ( 1 2 4 5 8 ) �> ( 1 2 4 5 8 ) ( 1 2 4 5 8 ) �> ( 1 2 4 5 8 ) ( 1
 * 2 4 5 8 ) �> ( 1 2 4 5 8 ) ( 1 2 4 5 8 ) �> ( 1 2 4 5 8 )
 */