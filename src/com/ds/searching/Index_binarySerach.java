package com.ds.searching;

import java.util.Arrays;

public class Index_binarySerach {
  
    // Function to find the index of an element 
    public static int findIndex(int arr[], int t) 
    { 
  
        int index = Arrays.binarySearch(arr, t); 
        return (index < 0) ? -1 : index; 
    } 
    // Driver Code 
    public static void main(String[] args) 
    { 
    	//input sorted order in ascending
    	int[] my_array = { 1, 2, 3, 4, 5, 6, 7 }; 
    	//int[] my_array = { 7,6,5,4,3,2,1}; 
  
        // find the index of 5 
        System.out.println("Index position of 7 is: "
                           + findIndex(my_array, 7)); 
  
        // find the index of 7 
        System.out.println("Index position of 5 is: "
                           + findIndex(my_array, 5)); 
    } 
    //Note: Input array should be in ascending order to find the index in binary search
   // output: Index position of 7 is:6
   //Index position of 5 is:4
} 