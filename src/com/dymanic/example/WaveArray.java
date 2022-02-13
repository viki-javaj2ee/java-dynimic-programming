package com.dymanic.example;

import java.util.Arrays;

public class WaveArray {

	public static void main(String[] args) {
		System.out.println("\n\t<<< Inside WaveArray >>>\n");
		WaveArray waveArray = new WaveArray();
		
		int[] arr = { 1,2, 3,4,5,6,7};
		System.out.println("Original array is --- "+Arrays.toString(arr));
		waveArray.convertToWave(arr);
		System.out.println("        Output is --- "+Arrays.toString(arr));
	}

	public void convertToWave(int arr[]) {

		for(int i=0; i<arr.length-1; i = i+2) {
			int temp = arr[i];
			arr[i] = arr[i+1];
			arr[i+1] = temp;
		}

	}
}
