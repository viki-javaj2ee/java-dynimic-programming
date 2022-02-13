package com.dymanic.example;

import java.util.Arrays;

public class ThirdLargestElement {

	public static void main(String[] args) {
		System.out.println("\n\t<<< Inside ThirdLargestElement >>>\n");
		int[] arr = { 3, 1, 4, 5, 2, 6, 7 };

		ThirdLargestElement obj = new ThirdLargestElement();
		System.out.println("          Original array is ---> " + Arrays.toString(arr));
		System.out.println("Third Largest Element is is ---> " + obj.thirdLargestElement(arr));

	}

	public int thirdLargestElement(int[] arr) {

		int thirdMax = Integer.MIN_VALUE;
		
		if (arr.length < 3) {
			return thirdMax;
		}

		int max = Math.max(arr[0], arr[1]);
		int secondMax = Math.min(arr[0], arr[1]);

		
		for (int i=2;i<arr.length;i++) {

			if (arr[i] > thirdMax)
				thirdMax = arr[i];

			if (arr[i] > secondMax) {
				thirdMax = secondMax;
				secondMax = arr[i];
			}

			if(arr[i] > max) {
				secondMax = max;
				max = arr[i];
			}
		}
		return thirdMax;
	}

}

