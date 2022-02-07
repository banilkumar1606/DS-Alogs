package com.ds.sorting;

import java.util.Collections;
import java.util.HashMap;

public class Selectionsort {
	public static void main(String[] args) {
		
		HashMap<String, Integer> hashMap= new HashMap<>();
		hashMap.put("A", 1);
		Collections.unmodifiableMap(hashMap);
		hashMap.put("B", 1);
		hashMap.remove("A");
		
		hashMap.entrySet().stream().forEach(e->System.out.println(e.getKey()));
	}
	private static int[] selectionsort(int arr[]) {
		int result[] = new int[arr.length];
		int min_Index = 0;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>arr[min_Index]) {
				
			}
		}
		return result; 
	}
	private static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	
	
}	
