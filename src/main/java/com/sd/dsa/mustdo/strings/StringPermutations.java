package com.sd.dsa.mustdo.strings;

import java.util.*;

public class StringPermutations {

	/*
	 * 
	 * Given a string S. The task is to print all unique permutations of the given
	 * string in lexicographically sorted order.
	 * 
	 */

	public static void main(String args[]) {
		String input = "ABSG";
		char[] carr = input.toCharArray();
		Arrays.sort(carr);
		List<String> response = new ArrayList<>();
		boolean[] visited = new boolean[input.length()];
		dfs(carr, response, new StringBuilder(), visited);
		System.out.println("response " + response);
	}

	public static void dfs(char[] carr, List<String> response, StringBuilder currentString, boolean[] visited) {

		if (currentString.length() == 4) {
			response.add(currentString.toString());
			return;
		}

		for (int i = 0; i < carr.length; i++) {
			if (visited[i]) {
				continue;
			}
			currentString.append(carr[i]);
			visited[i] = true;
			dfs(carr, response, currentString, visited);
			visited[i] = false;
			currentString.deleteCharAt(currentString.length() - 1);
		}

	}

}
//ABGS ABSG AGBS AGSB ASBG ASGB BAGS BASG BGAS BGSA BSAG BSGA GABS GASB GBAS GBSA GSAB GSBA SABG SAGB SBAG SBGA SGAB SGBA