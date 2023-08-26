package com.sd.dsa.backtracking;

public class NumberOfCoinCombination {
	
	/*
	 * Question: You are given an array of positive integers representing coin
	 * denominations and a target amount. Write a function to compute the number of
	 * distinct combinations that can make up the target amount using any number of
	 * coins of each denomination. You can assume that you have an infinite supply
	 * of coins for each denomination.
	 * 
	 * For example:
	 * 
	 * Coin denominations: [1, 2, 5] Target amount: 5 Output: 4 Explanation: There
	 * are four ways to make up the amount 5: [1, 1, 1, 1, 1] [1, 1, 1, 2] [1, 2, 2]
	 * [5] Write a function to solve this problem and return the number of distinct
	 * combinations. If it's not possible to make up the target amount, return 0.
	 * 
	 */
	

	public static void main(String args[]) {
	      int[] coins = {1, 3, 4};
	      int target = 7;
	      int[] response = new int[1];
	      dfs(coins,target,0,response);
	      System.out.println("response "+response[0]);
	    }
	    
	    public static void dfs(int[] coins,int target,int index,int[] combo){
	         
	        if(index>=coins.length){
	            return;
	        }
	        if(target==0){
	            combo[0]+=1;
	          
	            return;
	        }
	        if(target<0){
	            return;
	        }
	        
	        //include
	        dfs(coins,target-coins[index],index,combo);
	        dfs(coins,target,index+1,combo);
	        
	        
	        
	    }
}