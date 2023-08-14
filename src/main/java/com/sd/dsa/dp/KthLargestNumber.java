package com.sd.dsa.dp;

import java.util.PriorityQueue;

public class KthLargestNumber {
	
	/*
	 * Question: Given an array of integers, write a function to find the "Kth"
	 * largest element in the array. You can assume that "K" is always valid, and
	 * the input array may contain duplicates.
	 * 
	 * Time complexity O(n * log k),
	 */

	public static int findKthLargest(int[] nums, int k) {
		PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> b - a);

		for (int num : nums) {
			queue.add(num);
		}

		int response = 0;
		while (k > 0) {
			response = queue.remove();
			k--;
		}
		return response;
	}

	public static void main(String[] args) {
		int[] nums = { 5, 5, 5, 5, 5 };
		int k = 1;
		int kthLargest = findKthLargest(nums, k);
		System.out.println("Kth largest element: " + kthLargest);
	}

}
