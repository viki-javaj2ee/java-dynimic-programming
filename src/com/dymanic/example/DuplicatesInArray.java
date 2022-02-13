package com.dymanic.example;

import java.util.ArrayList;
import java.util.Arrays;

public class DuplicatesInArray {

	public static void main(String[] args) {
		System.out.println("\n\t<<< Inside DuplicatesInArray >>>\n");
		int[] arr = { 2,3,1,2,3,3,2,3 };
		
		DuplicatesInArray duplicatesInArray = new DuplicatesInArray();
		System.out.println("      Original array is ---> " + Arrays.toString(arr));
		System.out.println("duplicates in array  is ---> " + duplicatesInArray.duplicates(arr));

	}
	
	public ArrayList<Integer> duplicates(int[] arr){
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		for(int i=0; i<arr.length; i++) {
			for (int j=i+1; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					result.add(arr[i]);
					break;
				}
			}
		}
		
		return result;
	}

}
