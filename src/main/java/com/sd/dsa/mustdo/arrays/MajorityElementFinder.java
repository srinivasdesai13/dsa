package com.sd.dsa.mustdo.arrays;

public class MajorityElementFinder {

	/*
	 * Question:
	 * 
	 * You are given an array of integers. Write a Java method to find the
	 * "Majority Element" in the array. The majority element is the element that
	 * appears more than ⌊ n/2 ⌋ times, where n is the length of the array.
	 * 
	 * This problem can be solved by Boyer-Moore Voting Algorithm Certainly! The
	 * Boyer-Moore Voting Algorithm is an efficient algorithm for finding the
	 * majority element in an array, assuming that the majority element always
	 * exists. The key idea behind the algorithm is to cancel out pairs of elements,
	 * incrementing and decrementing a counter based on certain conditions. The
	 * majority element will eventually stand out after processing the entire array.
	 * 
	 * Here's a step-by-step explanation of the Boyer-Moore Voting Algorithm:
	 * 
	 * Initialization:
	 * 
	 * Initialize two variables, candidate and count. Set candidate to the first
	 * element of the array. Set count to 1. Processing Elements:
	 * 
	 * Iterate through the array from the second element onwards. For each element,
	 * compare it with the current candidate. If the element is equal to the
	 * candidate, increment the count. If the element is different from the
	 * candidate, decrement the count. If count becomes zero, update the candidate
	 * to the current element, and reset count to 1. Verification:
	 * 
	 * After processing the entire array, the candidate variable contains a
	 * potential majority element. Run a second pass through the array to count the
	 * occurrences of the candidate. If the count of the candidate is greater than ⌊
	 * n/2 ⌋, where n is the length of the array, then the candidate is the majority
	 * element.
	 * 
	 */

	// Your task: Implement this method
	public static int findMajorityElement(int[] nums) {
		int candidate = nums[0];
		int count = 1;

		for (int i = 1; i < nums.length; i++) {
			if (nums[i] == candidate) {
				count++;
			} else {
				count--;
			}
			if (count == 0) {
				candidate = nums[i];
				count = 1;
			}

		}
		count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == candidate) {
				count++;
			}
		}

		if (count >= (nums.length / 2)) {
			return candidate;
		}

		return -1; // Replace this with the actual result
	}

	public static void main(String[] args) {
		// Example usage:
		int[] array = { 3, 3, 4, 2, 4, 4, 2, 4, 4 };
		int majorityElement = findMajorityElement(array);
		System.out.println("Majority Element: " + majorityElement);
	}
}
