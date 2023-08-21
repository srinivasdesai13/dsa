package com.sd.dsa.backtracking;

public class MiinNumberOfCoins {

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
}