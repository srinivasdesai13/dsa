package com.sd.dsa.backtracking;
public class MaxItemsInBudget {
	
	/*
	 * 
	 * Question: You are given a list of positive integers representing the prices
	 * of items for sale and a positive integer representing your budget. Write a
	 * function to determine the maximum number of items you can purchase within
	 * your budget, considering that you can only buy each item once.
	 * 
	 * 
	 * Input: The input consists of an array prices containing positive integers
	 * representing the prices of items, and an integer budget representing your
	 * budget.
	 * 
	 * Output: The function should return the maximum number of items you can
	 * purchase within your budget, considering that each item can be bought only
	 * once.
	 * 
	 * This problem involves dynamic programming and is often referred to as the
	 * "0/1 Knapsack Problem." Feel free to provide your solution in Java!
	 */

    public static int maxItems(int[] prices, int budget) {
        return dfs(prices,budget,0,0);
    }
    
    public static int dfs(int[] prices, int budget, int index, int currentcount){
        
        if(index>=prices.length){
            return 0;
        }
        if(budget<0){
            return 0;
        }
       
        if(budget==0){
            return currentcount;    
        }
         int inc = dfs(prices,budget-prices[index],index+1,currentcount+1);
         int exc = dfs(prices,budget,index+1,currentcount);
         return Math.max(inc,exc);
        
        
    }

    public static void main(String[] args) {
        int[] prices = { 10, 20, 30, 40, 50 };
        int budget = 100;
        int maxItems = maxItems(prices, budget);
        System.out.println("Maximum items that can be purchased: " + maxItems);
    }
}
