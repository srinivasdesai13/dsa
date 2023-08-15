package com.sd.dsa.dp;

public class BinarySearch {

	/*
	 * Implement a function that takes a sorted array of integers and a target value
	 * as input. The function should find the target value in the array using binary
	 * search and return the index where the target is located. If the target is not
	 * found, return -1.
	 * 
	 * TimeComplexity: O(log n)
	 */

	public static void main(String[] args) {
        int[] nums = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
        int target = 14;
        int index = binarySearch(nums, target);
        System.out.println("Target found at index: " + index);
    }
    
    public static int binarySearch(int[] nums, int target) {
        int l = 0,r = nums.length;
        
        while(l<r){
            int m = (l+r)/2;
            
            if(nums[m]==target){
                return m;
            }
            
            if(target > nums[m]){
                //target is on the right side
                l = m+1;
            } else {
                r = m-1;
            }
            
            
          
        }
         return -1; 
    }

}
