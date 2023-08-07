package com.sd.dsa.dp;

public class MaxProductOfAnyTwoDistinctElements {
	
	/*
	 * You are given an array of integers, and your task is to find the maximum
	 * product of any two distinct elements in the array. If the array contains
	 * fewer than two elements, return 0.
	 * 
	 * For example:
	 * 
	 * If the input array is [3, 7, 1, 9, 4], the maximum product of any two
	 * distinct elements is 63 (9 * 7). 
	 * If the input array is [5, 2, 1, 6], the
	 * maximum product of any two distinct elements is 30 (5 * 6). Write a function
	 * to solve this problem and return the maximum product. If the array contains
	 * fewer than two elements, return 0.
	 * 
	 */

	 public static void main(String args[]) {
		    int[] arr = {5, 2, 1, 6};
		     int response = maxProductOfAnyTwoDistinctElements(arr);
		     System.out.println("response "+response);
		    }
		    
		   public static int maxProductOfAnyTwoDistinctElements(int[] arr) {
		       int max1 = 0;
		       int max2 = 0;
		       
		       for(int num:arr){
		           if(num>max1){
		               max2 = max1;
		               max1 = num;
		           }
		       }
		       
		       return max1*max2;
		   }

}
