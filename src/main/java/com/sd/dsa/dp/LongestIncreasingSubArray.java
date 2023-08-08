package com.sd.dsa.dp;

public class LongestIncreasingSubArray {

	public static void main(String[] args) {
		 int[] arr = {1,2,3,4,5};
	     
	     int max = Integer.MIN_VALUE;;
	     int len = 1;
	    for(int i=1;i<arr.length;i++){
	        if(arr[i]>=arr[i-1]){
	            len+=1;
	        } else {
	            max = Math.max(max,len);
	            len = 1;
	        }
	        
	    }
	     max = Math.max(max,len);
	     System.out.println("max = "+max);

	}

}
