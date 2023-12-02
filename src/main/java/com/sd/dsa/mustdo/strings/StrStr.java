package com.sd.dsa.mustdo.strings;

public class StrStr {

	/*
	 * * Your task is to implement the function strstr. The function takes two
	 * strings as arguments (s,x) and locates the occurrence of the string x in the
	 * string s. The function returns an integer denoting the first occurrence of
	 * the string x in s (0 based indexing).
	 * 
	 * Note: You are not allowed to use inbuilt function.
	 * 
	 */ public static void main(String args[]) {
		int response = strstr("abcabcabcd", "abcd");
		System.out.println("response " + response);
	}

	private static int strstr(String s, String x) {
		if (s == null || x == null || s.length() < x.length()) {
			return -1;
		}

		int l = 0, r = x.length();
		while (r <= s.length()) {
			String ss = s.substring(l, r);
			if (x.equals(ss)) {
				return l;
			}
			l++;
			r++;
		}
		return -1;
	}

}
