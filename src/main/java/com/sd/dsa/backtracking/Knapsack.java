package com.sd.dsa.backtracking;

public class Knapsack{
	
	
	public static void main(String args[]) {
	      int[] w = {2, 3, 4, 5};
	      int[] p = {4, 7, 5, 8};
	      int capacity = 7; 
	      int response = dfs(w,p,capacity,0,0,0);
	      //int response = dfs2(w,p,capacity,0,0);
	      System.out.println(response);
	    }
	    
	    
	    public static int dfs(int[] w, int[] p, int capacity, int index, int totalWeight, int total){
	        if(index==w.length){
	            return total;
	        }
	        
	        if(totalWeight>capacity){
	            return 0;
	        }
	        
	        
	        int inc = 0;
	        if(totalWeight+w[index]<=capacity){
	            inc = dfs(w,p,capacity,index+1,totalWeight+w[index], total+p[index]);
	        }
	        
	        int exc = dfs(w,p,capacity,index+1,totalWeight, total);
	        return Math.max(inc,exc);
	        
	        
	        
	    }
	    
	    public static int dfs2(int[] w, int[] p, int capacity, int currentsum,  int index){
	        
	        if(index==w.length){
	            return currentsum;
	        }
	        if(capacity<0){
	            return 0;
	        }
	        
	       
	        if(capacity==0){
	            return currentsum;
	        }
	        
	        if(w[index]>capacity){
	            return currentsum;
	        }
	       
	        int inc = dfs2(w,p,capacity-w[index], currentsum+p[index], index+1);
	       
	        int ex = dfs2(w,p,capacity,currentsum,index+1);
	       
	        return Math.max(inc,ex);
	    }
	
	
}