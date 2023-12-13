package com.sd.dsa.mustdo.strings;

import java.util.HashSet;
import java.util.Set;

public class LongestDistinctcharactersinstring {
	
	/**
	 * Given a string S, find the length of the longest substring with all distinct characters. 
	
	*/
	public static void main(String[] args) {
		
		int response = longestSubstrDistinctChars("geeksforgeeks");
	 System.out.println("response "+response);

	}
	
	private static int longestSubstrDistinctChars(String s){
		Set<Character> set = new HashSet<>();
		int l=0,r=0;
		int longest = Integer.MIN_VALUE;
		while(r<s.length()) {
			char current_char = s.charAt(r);
			while(set.contains(current_char)) {
				set.remove(s.charAt(l));
				l++;
			}
			set.add(current_char);
			longest = Math.max(longest, r-l+1);
			r++;
		}
		
		return longest;
	}

}
