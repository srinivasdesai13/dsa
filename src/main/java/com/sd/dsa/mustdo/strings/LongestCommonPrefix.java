package com.sd.dsa.mustdo.strings;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] arr = { "abcdef", "abcdef", "abcdefg", "ab", "abc" };
		int n = 5;
		String response = longestCommonPrefix(arr, n);
		System.out.println("response " + response);

	}

	private static String longestCommonPrefix(String arr[], int n) {
		if (arr.length == 0) {
			return "-1";
		}
		StringBuilder longest = new StringBuilder();
		;
		String shortest = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (shortest.length() > arr[i].length()) {
				shortest = arr[i];
			}
		}

		for (int i = 0; i < shortest.length(); i++) {
			char current_char = shortest.charAt(i);

			for (int j = 0; j < n; j++) {

				if (arr[j].charAt(i) != current_char) {
					if (longest.length() == 0) {
						return "-1";
					}
					return longest.toString();
				}

			}
			longest.append(current_char);
		}

		return longest.length() == 0 ? "-1" : longest.toString();
	}
}
