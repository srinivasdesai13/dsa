package com.sd.dsa.dp;

public class MissingNumber {
	
	
	/*
	 * Problem: You are given an array nums containing n distinct numbers taken from
	 * 0, 1, 2, ..., n. Your task is to find the one number that is missing from the
	 * array.
	 * 
	 * Input:
	 * 
	 * An array of integers, int[] nums, where 1 <= nums.length <= 10^4 and 0 <=
	 * nums[i] <= n. Output:
	 * 
	 * An integer representing the missing number.
	 * 
	 */
	
	
	public static void main(String args[]) {
		int x = 10;
		int y = 25;
		int z = x + y;
		int[] nums = { 6,1,2,8,3,4,7,10,5};

		System.out.println("Sum of x+y = " + missingNumber(nums));
	}

	public static int missingNumber(int[] nums) {
		int[] response = new int[nums.length + 1];
		int max = Integer.MIN_VALUE;
		for (int num : nums) {
			response[num]++;
			max = Math.max(max, num);
		}
		int missingNumber = 0;
		for (int i = 0; i < response.length; i++) {
			if (response[i] == 0) {
				missingNumber = i;
				break;
			}
		}

		if (missingNumber == 0) {
			missingNumber = max + 1;
		}

		return missingNumber;
	}

}