package com.dymanic.example;

import java.util.Arrays;

public class EquilibriumPoint {

	public static void main(String[] args) {
		System.out.println("\n\t<<< Inside EquilibriumPoint >>>\n");
		int[] arr = { 1, 3, 5, 5, 5, 2, 2 };

		EquilibriumPoint equilibriumPoint = new EquilibriumPoint();
		System.out.println("  Original array is ---> " + Arrays.toString(arr));
		System.out.println("equilibriumPoint is ---> " + equilibriumPoint.equilibriumPoint(arr));
	}

	public int equilibriumPoint(int[] arr) {
		int size = arr.length;

		if (size == 1)
			return arr[0];

		int totalSum = 0;
		int currentSum = 0;
		int result = -1;

		for (int i = 0; i < size; i++) {
			totalSum += arr[i];
		}

		for (int i = 1; i < size; i++) {
			currentSum = currentSum + arr[i - 1];
			if (totalSum - currentSum - arr[i] == currentSum) {
				result = i;
				break;
			}
		}

		return result == -1 ? -1 : result + 1;
	}
}
