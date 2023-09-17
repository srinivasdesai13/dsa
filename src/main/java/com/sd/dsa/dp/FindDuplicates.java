package com.sd.dsa.dp;
import java.util.*;

public class FindDuplicates {
	public static void main(String args[]) {
		List<Integer> arr = List.of(3, 1, 2, 2, 1, 4, 5);

		System.out.println("Sum of x+y = " + findDuplicates(arr));
	}

	public static List<Integer> findDuplicates(List<Integer> nums) {
		int max = nums.stream().max(Comparator.comparingInt(Integer::intValue)).get();
		int[] response = new int[max + 1];

		for (int i = 0; i < nums.size(); i++) {
			response[nums.get(i)]++;
		}
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < response.length; i++) {
			if (response[i] > 1) {
				list.add(i);
			}
		}
		return list;
	}

}