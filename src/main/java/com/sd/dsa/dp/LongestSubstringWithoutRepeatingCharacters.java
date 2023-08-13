package com.sd.dsa.dp;

import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters {

	
	
	/*
	 * Question: You are given a string representing a sequence of characters. You
	 * need to find the length of the longest substring without repeating
	 * characters.
	 * 
	 * For example:
	 * 
	 * Input: "abcabcbb" Output: 3 (The longest substring without repeating
	 * characters is "abc")
	 * 
	 */
	
	
	
	public static void main(String args[]) {
		String str = "bbbbb";
		Set<Character> set = new HashSet<>();
		int l = 0;
		int r = 0;
		int max = Integer.MIN_VALUE;
		while (r < str.length()) {
			char c = str.charAt(r);
			while (set.contains(c)) {
				set.remove(str.charAt(l));
				l++;
			}
			max = Math.max(max, r - l + 1);
			set.add(c);
			r++;

		}

		System.out.println("max = " + max);
	}

}
