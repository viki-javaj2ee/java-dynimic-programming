package com.dymanic.example;

import java.util.Arrays;

public class ValidMountainArray {

	public static void main(String[] args) {
		System.out.println("\n\t<<< Inside ValidMountainArray >>>\n");
		int[] arr = { 0, 2, 3, 4, 5, 2, 1, 0, };

		ValidMountainArray obj = new ValidMountainArray();
		System.out.println("                     Original array is ---> " + Arrays.toString(arr));
		System.out.println("Is given array a valid mountain array  ---> " + obj.validMountainArray(arr));

	}

	public boolean validMountainArray(int[] arr) {
		int size = arr.length;
		if (size < 3)
			return false;

		boolean inc = false;
		boolean dec = false;

		for (int i = 1; i < size; i++) {
			if (arr[i] > arr[i - 1]) {
				if (dec) {
					return false;
				}
				inc = true;
			} else if (arr[i] < arr[i - 1]) {
				if (!inc) {
					return false;
				}
				dec = true;
			}else {
				return false;
			}
		}

		return inc && dec;
	}

}
