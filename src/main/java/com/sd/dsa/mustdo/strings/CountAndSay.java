package com.sd.dsa.mustdo.strings;

public class CountAndSay {

	/*
	 * Problem: Count and Say
	 * 
	 * The count-and-say sequence is a series of strings where each string is formed
	 * based on the previous string. The process is as follows:
	 * 
	 * Start with the first string: "1" Each subsequent string is formed by "saying"
	 * the counts of the digits in the previous string. For example: The second
	 * string is "11" because there is one "1" in the first string. The third string
	 * is "21" because there are two "1"s in the second string. The fourth string is
	 * "1211" because there is one "2" and one "1" in the third string. And so on.
	 * 
	 */
	public static void main(String[] args) {
		System.out.println(countAndSay(4));

	}

	public static String countAndSay(int n) {
	    if (n <= 0) {
	        return "";
	    }

	    StringBuilder result = new StringBuilder("1");

	    for (int i = 1; i < n; i++) {
	        StringBuilder temp = new StringBuilder();
	        int count = 1;

	        for (int j = 1; j < result.length(); j++) {
	            if (result.charAt(j) == result.charAt(j - 1)) {
	                count++;
	            } else {
	                temp.append(count).append(result.charAt(j - 1));
	                count = 1;
	            }
	        }

	        temp.append(count).append(result.charAt(result.length() - 1));
	        result = temp;
	    }

	    return result.toString();
	}


}
