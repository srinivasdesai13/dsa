package com.sd.dsa.backtracking;

public class NumberOfCoinCombination {

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