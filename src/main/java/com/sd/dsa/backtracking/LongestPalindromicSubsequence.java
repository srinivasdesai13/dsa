package com.sd.dsa.backtracking;

import java.util.*;

public class LongestPalindromicSubsequence {

	/*
	 * 
	 * Problem: Given a string s, find the length of the longest palindromic
	 * subsequence in s. A palindromic subsequence is a sequence of characters in
	 * the same order as they appear in the original string, but not necessarily
	 * contiguous, and it reads the same backward as forward.
	 * 
	 * Write a function to find the length of the longest palindromic subsequence in
	 * the input string.
	 * 
	 * For example, if the input string is "bbab", the longest palindromic
	 * subsequence is "bab" or "bbb," and the function should return 3.
	 * 
	 * 
	 * 
	 */

	public static void main(String args[]) {
		String str = "racecar";
		int max = Integer.MIN_VALUE;
		Map<String, Integer> cache = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			int x = dfs(str, i, i, cache);
			int y = dfs(str, i, i + 1, cache);
			max = Math.max(max, Math.max(x, y));
		}
		System.out.println("response " + max);
	}

	public static int dfs(String str, int i, int j, Map<String, Integer> cache) {

		if (i < 0 || j == str.length()) {
			return 0;
		}

		if (cache.get(i + "-" + j) != null) {
			return cache.get(i + "-" + j);
		}

		if (str.charAt(i) == str.charAt(j)) {
			int length = (i == j) ? 1 : 2;
			length = length + dfs(str, i - 1, j + 1, cache);
			cache.put(i + "-" + j, length);
		} else {
			int max = Math.max(dfs(str, i, j + 1, cache), dfs(str, i - 1, j, cache));
			cache.put(i + "-" + j, max);

		}
		return cache.get(i + "-" + j);
	}
}