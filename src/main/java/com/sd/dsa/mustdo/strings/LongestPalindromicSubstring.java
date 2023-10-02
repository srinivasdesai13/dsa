package com.sd.dsa.mustdo.strings;

public class LongestPalindromicSubstring {
	public static void main(String args[]) {
		String input = "cbbd";

		int i = 0;
		int max = Integer.MIN_VALUE;
		while (i < input.length()) {
			int l = i, r = i;
			while (l >= 0 && r < input.length() && input.charAt(l) == input.charAt(r)) {
				max = Math.max(max, r - l + 1);
				l--;
				r++;
			}

			l = i;
			r = i + 1;
			while (l >= 0 && r < input.length() && input.charAt(l) == input.charAt(r)) {
				max = Math.max(max, r - l + 1);
				l--;
				r++;
			}

			i++;
		}
		System.out.println("max=" + max);

	}
}