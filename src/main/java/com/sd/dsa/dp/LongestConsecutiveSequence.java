package com.sd.dsa.dp;

import java.util.*;
public class LongestConsecutiveSequence {

	/*
	 * Problem: Longest Consecutive Sequence
	 * 
	 * Given an unsorted array of integers, find the length of the longest
	 * consecutive elements sequence.
	 * 
	 * For example, if the input array is [100, 4, 200, 1, 3, 2], the longest
	 * consecutive elements sequence is [1, 2, 3, 4], and the function should return
	 * 4.
	 * 
	 */

	public static void main(String[] args) {
		
		
		int[] nums = {100, 4, 200, 1, 3, 2};
		Set<Integer> set = new HashSet<>();
		
		for(int num:nums) {
			set.add(num);
		}
		
		int longest = 0;
		for(int num:nums) {
			int currentLongest = 1;
			int nextNum = num+1;
			
			while(set.contains(nextNum)) {
				currentLongest++;
				nextNum++;
			}
			longest = Math.max(longest, currentLongest);
			
		}
		
		System.out.println("Longest: "+longest);

	}

}
