package com.sd.dsa.dp;

public class StockSell {

	
	/*
	 * You are given an array of integers representing the stock prices of a company
	 * over a period of time. You want to maximize your profit by buying and selling
	 * the stock. However, you can only make one transaction (i.e., buy once and
	 * sell once).
	 * 
	 * Write a function to find the maximum profit that can be obtained from one
	 * transaction. If it is not possible to make a profit, return 0.
	 * 
	 * For example:
	 * 
	 * If the stock prices are [7, 1, 5, 3, 6, 4], the maximum profit that can be
	 * obtained is 5 (by buying at 1 and selling at 6). If the stock prices are [7,
	 * 6, 4, 3, 1], it is not possible to make a profit, so the function should
	 * return 0.
	 * 
	 * 
	 * 
	 */
	
	
	
	
	
	
	
	public static void main(String args[]) {
	       
	    int[] prices = {7, 6, 4, 3, 1};
	     int response = findMaxProfit(prices);
	     System.out.println("response = "+response);
	    }
	    
	    public static int findMaxProfit(int[] prices){
	        int min = Integer.MAX_VALUE;
	        int max = Integer.MIN_VALUE;
	        for(int num:prices){
	            min = Math.min(min,num);
	            max = Math.max(max,num-min);
	        }
	        
	        return max;
	    }

}
