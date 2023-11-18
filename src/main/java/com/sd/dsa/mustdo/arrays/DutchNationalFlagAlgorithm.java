package com.sd.dsa.mustdo.arrays;

import java.util.Arrays;

public class DutchNationalFlagAlgorithm {

	/*
	 * Question:
	 * 
	 * You are given an array containing only 0s, 1s, and 2s. Write a Java method to
	 * sort the array in-place using the Dutch National Flag algorithm.
	 * 
	 */
	public static void sortColors(int[] nums) {
       int low = 0;
       int mid = 0;
       int high = nums.length-1;
       while(mid<=high) {
    	   if(nums[mid]==0) {
    		   swap(nums,low,mid);
    		   low++;
    		   mid++;
    	   } else if(nums[mid]==1) {
    		   mid++;
    	   } else if(nums[mid]==2) {
    		   swap(nums,mid,high);
    		   high--;
    	   }
    	   
    	   
       }
       
    }

    private static void swap(int[] nums, int i, int j) {
    	int temp = nums[i];
    	nums[i] = nums[j];
    	nums[j] = temp;
	}

	public static void main(String[] args) {
        // Example usage:
        int[] colors = {2, 0, 1, 1, 0, 2, 1, 2, 0};
        sortColors(colors);

        // Output the sorted array
        System.out.println("Sorted Colors: " + Arrays.toString(colors));
    }
}
