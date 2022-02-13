package com.dymanic.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		System.out.println("Inside TowSum...");
		int[] num = { 2, 7, 11, 15 };
		int target = 18;
		TwoSum twoSum = new TwoSum();
		System.out.println("Original array is ---> "+Arrays.toString(num));
		System.out.println(Arrays.toString(twoSum.twoSum(num, target)));
		System.out.println(Arrays.toString(twoSum.twoSumWithHashMap(num, target)));
		System.out.println(Arrays.toString(twoSum.twoSumWithHashMap1(num, target)));
	}

	public int[] twoSum(int[] num, int target) {

		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] + num[j] == target)
					return new int[] { i, j };
			}
		}

		throw new IllegalArgumentException("No such numbers found.");
	}
	
	public int[] twoSumWithHashMap(int[] num, int target) {

		Map<Integer,Integer> input = new HashMap<Integer,Integer>();
		
		for(int i=0;i<num.length;i++)
			input.put(num[i], i);
			
		
		for (int i = 0; i < num.length; i++) {
			int secondNumber = target- num[i];
			
			if (input.containsKey(secondNumber) && input.get(secondNumber)!=i)
					return new int[] { i, input.get(secondNumber) };
		}

		throw new IllegalArgumentException("No such numbers found.");
	}
	
	public int[] twoSumWithHashMap1(int[] num, int target) {

		Map<Integer,Integer> input = new HashMap<Integer,Integer>();
		
		for (int i = 0; i < num.length; i++) {
			int secondNumber = target- num[i];
			
			if (input.containsKey(secondNumber))
					return new int[] { input.get(secondNumber),i };
			input.put(num[i], i);
		}

		throw new IllegalArgumentException("No such numbers found.");
	}

}


