package com.sd.dsa.mustdo.arrays;

public class FindDuplicatesInArray {
	
	/*
	 * Find duplicates without using extra space
	
	*/	public static void main(String[] args) {
	
			int[] nums = {5,4,1,2,2,3};

			int slow = nums[0];
			int fast = nums[0];
			
			do {
				slow = nums[slow];
				fast = nums[nums[fast]];
				
			}while(slow!=fast);
			
			slow = nums[0];
			while(slow!=fast) {
				slow = nums[slow];
				fast = nums[fast];
			}
			
			int duplicate = slow;
			System.out.println("duplicate "+duplicate);
	}

}
