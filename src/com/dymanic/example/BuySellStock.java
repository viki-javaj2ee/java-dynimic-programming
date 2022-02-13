package com.dymanic.example;

public class BuySellStock {

	public static void main(String[] args) {
		System.out.println("Inside main...");
		BuySellStock bss = new BuySellStock();
//		int[] prices = {7,1,5,3,6,4};
		int[] prices = {2,1,1,3,9,8};
		System.out.println(bss.buySellStock(prices));
	}

	public int buySellStock(int[] prices) {
		
		if (prices.length <2) {
			return 0;
		}

		int minPriceSoFar = prices[0];
		int calculatedProfitSofar = 0;

		for (int i = 1; i < prices.length; i++) {
			calculatedProfitSofar = Math.max(calculatedProfitSofar, prices[i]-minPriceSoFar);
			minPriceSoFar = Math.min(minPriceSoFar, prices[i]);
		}
		return calculatedProfitSofar;
	}

}
