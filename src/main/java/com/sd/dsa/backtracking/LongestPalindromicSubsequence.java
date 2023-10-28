package com.sd.dsa.backtracking;

import java.util.*;

public class LongestPalindromicSubsequence {
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