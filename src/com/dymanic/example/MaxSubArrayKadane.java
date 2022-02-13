package com.dymanic.example;

import java.util.Arrays;

public class MaxSubArrayKadane {

	public static void main(String[] args) {
		System.out.println("\n\t<<< Inside MaxSubArrayKadane >>>\n");
		int[] arr = { -2,-3,4,-1,-2,1,5,-3 };

		MaxSubArrayKadane obj = new MaxSubArrayKadane();
		System.out.println("       Original array is ---> " + Arrays.toString(arr));
		System.out.println("Maxiumum subarray sum is ---> " + obj.maxSubArray(arr));
	}
	
	public int maxSubArray(int[] arr) {
		
		int sum =0;
		int maximum = arr[0];
		for(int i=0;i<arr.length; i++) {
			sum += arr[i];
			if(sum > maximum ) maximum = sum;
			if(sum < 0) sum = 0;	
		}
		
		return maximum;
		
	}

}
