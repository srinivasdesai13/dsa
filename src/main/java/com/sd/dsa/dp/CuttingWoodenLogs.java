package com.sd.dsa.dp;

public class CuttingWoodenLogs {
	
	/*
	 * Question: You are given a list of positive integers representing the lengths
	 * of wooden logs. Your task is to cut these logs into smaller pieces such that
	 * the total number of pieces is maximized. However, there are some rules to
	 * follow:
	 * 
	 * You can only make cuts at integer positions. You must make at least one cut
	 * in each log. The length of each resulting piece after cutting should be at
	 * least k. Write a dynamic programming function to find the maximum number of
	 * pieces you can obtain by cutting the logs according to these rules.
	 * 
	 */
	
	public static void main(String args[]) {
		int[] arr = { 5, 8, 10, 12, 15 };
		int min_len = 7;
		int i = 0;
		int total = 0;
		while (i < arr.length) {
			int num = arr[i];
			if (num > min_len) {
				total += (num / min_len);
				if (num % min_len > 0) {
					total += 1;
				}
			}
			i++;

		}
		System.out.println(" total = " + total);
	}

}
