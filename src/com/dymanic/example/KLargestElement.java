package com.dymanic.example;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KLargestElement {

	public static void main(String[] args) {
		System.out.println("\n\t<<< Inside KLargestElement >>>\n");
		int[] arr = { 12, 5, 787, 1, 23 };
		int k = 2;

		KLargestElement obj = new KLargestElement();
		System.out.println("                  Original array is ---> " + Arrays.toString(arr));
		System.out.println("KLargestElement in gevena array is  ---> " + Arrays.toString(obj.kLargestElement(arr, k)));
	}

	public int[] kLargestElement(int[] arr, int k) {

		int[] result = new int[k];
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>((i, j) -> j - i);

		for (int i : arr) {
			maxHeap.add(i);
		}

		for (int i = 0; i < k; i++) {
			result[i] = maxHeap.poll();
		}

		return result;
	}

}
