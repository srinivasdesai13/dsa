package com.sd.dsa.dp;

public class StockSell {

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
