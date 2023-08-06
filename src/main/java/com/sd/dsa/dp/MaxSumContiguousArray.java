package com.sd.dsa.dp;

public class MaxSumContiguousArray {

	/*
	 * You are given a list of n integers, and your task is to find the maximum sum of any contiguous subarray of the list. The subarray must contain at least one element.

For example, given the list [1, -2, 3, 4, -1, 2, 1, -5, 4], the maximum sum of any contiguous subarray is 6, which is obtained by adding the elements [3, 4, -1, 2, 1].

Write a function to solve this problem and return the maximum sum of any contiguous subarray.
	*/
	
	public static void main(String[] args) {
		int[] arr = {1, -2, 3, 4, -1, 2, 1, -5, 4};
		
		int max = Integer.MIN_VALUE;
		int current_sum = 0;
		for(int i=0;i<arr.length;i++) {
			
			current_sum = Math.max(arr[i], current_sum+arr[i]);
			max = Math.max(max, current_sum);
			
			
			
		}
		
		System.out.println("max "+max);

	}

}
