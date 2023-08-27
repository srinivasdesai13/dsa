package com.sd.dsa.dp;

public class StockProfit {
	
	/**
	 * Question: You are given a list of integers representing a sequence of stock
	 * prices. Write a function to find the best days to buy and sell the stock in
	 * order to maximize your profit. You can buy and sell the stock only once.
	 * 
	 */
	
	public static int[] maxProfit(int[] prices) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int buy = 0;
		int sell = 0;
		for (int i = 0; i < prices.length; i++) {

			if (prices[i] <= min) {
				min = prices[i];
				buy = i;
			} else {
				if (prices[i] - min > max) {
					max = prices[i] - min;
					sell = i;
				}
			}

		}
		int[] response = new int[2];
		response[0] = buy;
		response[1] = sell;
		return response;

	}

	public static void main(String[] args) {
		int[] prices = { 7, 1, 5, 3, 6, 4 };
		int[] result = maxProfit(prices);
		System.out.println("Buy on day " + result[0] + " and sell on day " + result[1]);
	}
}
