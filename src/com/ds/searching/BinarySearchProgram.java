package com.ds.searching;

public class BinarySearchProgram {
	public static void main(String[] args) {
		
		//input sorted order in ascending
    	int[] my_array = { 1, 2, 3, 4, 5, 6, 7 }; 
    	//int[] my_array = { 7,6,5,4,3,2,1}; 
  
        // find the index of 5 
        System.out.println("Index position of 7 is: "
                           + binarySearch(my_array, 7)); 
  
        // find the index of 7 
        System.out.println("Index position of 5 is: "
                           + binarySearch(my_array, 5)); 
	}
	//Binary Search method
	//If the array in sorted order we will get the low and high values and get the mid value
	private static int binarySearch(int[] a,  int key) {
		int low = 0;
		int high = a.length - 1;

		while (low <= high) {
			int mid = (low + high)>>>1;
			System.out.println(Integer.toBinaryString(mid));
			int midVal = a[mid];

			if (midVal < key)
				low = mid + 1;
			else if (midVal > key)
				high = mid - 1;
			else
				return mid; // key found
		}
		return -(low + 1); // key not found.
	}
	/*
	 * 11 101 110 Index position of 7 is: 6 11 101 100 Index position of 5 is: 4
	 * 
	 */
}
