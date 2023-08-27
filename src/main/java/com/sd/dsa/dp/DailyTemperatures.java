package com.sd.dsa.dp;

import java.util.*;

public class DailyTemperatures {

	/*
	 * 
	 * Question: You are given an array of integers representing the daily
	 * temperatures. Write a function to find the number of days you would have to
	 * wait until a warmer temperature. If there is no future day with a warmer
	 * temperature, consider waiting forever and return 0 for that day.
	 * 
	 * Input: The input is an array temperatures where temperatures[i] represents
	 * the temperature on day i.
	 * 
	 * Output: The function should return an array result, where result[i]
	 * represents the number of days you would have to wait until a warmer
	 * temperature compared to the temperature on day i.
	 * 
	 * For example, in the input array {73, 74, 75, 71, 69, 72, 76, 73}, on day 1
	 * (temperature 74), you would have to wait 1 day for a warmer temperature (day
	 * 2, temperature 75). Similarly, on day 3 (temperature 71), you would have to
	 * wait 2 days for a warmer temperature (day 6, temperature 72). Therefore, the
	 * function should return [1, 1, 4, 2, 1, 1, 0, 0].
	 */

	public static void main(String[] args) {
		int[] temperatures = { 73, 74, 75, 71, 69, 72, 76, 73 };
		int[] result = dailyTemperatures(temperatures);
		System.out.println("Number of days to wait for warmer temperatures: " + Arrays.toString(result));
	}

	public static int[] dailyTemperatures(int[] temperatures) {

		int[] response = new int[temperatures.length];
		int len = temperatures.length;
		int j = 0;
		Stack<int[]> stack = new Stack<>();
		while (j < len) {
			int temp = temperatures[j];
			while (!stack.isEmpty() && stack.peek()[1] < temp) {
				response[stack.peek()[0]] = j - stack.peek()[0];
				stack.pop();
			}
			int[] arr = { j, temp };
			stack.push(arr);
			j++;
		}

		return response;
	}

}
