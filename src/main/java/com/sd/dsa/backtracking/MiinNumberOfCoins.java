package com.sd.dsa.backtracking;
import java.util.*;
public class MiinNumberOfCoins {
	
	/*
	 * Question: You are given an array of positive integers representing coin
	 * denominations and a target amount. Write a dynamic programming function to
	 * find the minimum number of coins needed to make up the target amount. You can
	 * use each coin denomination an unlimited number of times.
	 * 
	 * For example:
	 * 
	 * Coin denominations: [1, 2, 5] Target amount: 11 Output: 3 (1 coin of
	 * denomination 5, 2 coins of denomination 3) Write a function to solve this
	 * problem and return the minimum number of coins needed. You can assume that
	 * there is always a combination of coins that can make up the target amount.
	 * 
	 */

	public static void main(String args[]) {
	     int[] coins = {1, 3, 5};
	     int target = 7;
	     int[] response = new int[1];
	     response[0] = Integer.MAX_VALUE;
	    dfs(coins,0,target,0,response);
	     System.out.println("Response = "+response[0]);
	    
	     
	    }
	    public static void dfs(int[] coins, int index, int target, int total_coins, int[] response){
	        if(index==coins.length ){
	            return;
	        }
	        
	        if(target<0){
	            return ;
	        }
	        
	        if(target==0){
	            response[0] = Math.min(response[0],total_coins);
	            return;
	        }
	      
	        
	       dfs(coins,index,target-coins[index],total_coins+1,response);
	       dfs(coins, index+1,target,total_coins,response);
	      
	    }
	    
	    public static void dfs(int[] coins, int index, int target, int total_coins, int[] response,Map<String,Integer> memo){
	        if(index==coins.length ){
	            return;
	        }
	        if(memo.get(target+"-"+index)!=null){
	            if(response[0]<memo.get(target+"-"+index)) {
	            	memo.put(target+"-"+index, response[0]);
	            }
	        } else {
	             memo.put(target+"-"+index, total_coins);
	        }
	        
	        if(target<0){
	            return ;
	        }
	        
	        if(target==0){
	            response[0] = Math.min(response[0],total_coins);
	            return;
	        }
	      
	        
	       dfs(coins,index,target-coins[index],total_coins+1,response,memo);
	       dfs(coins, index+1,target,total_coins,response,memo);
	      
	    }
}