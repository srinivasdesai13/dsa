package com.sd.dsa.dp;
import java.util.*;
public class FindPairsWithSum {

	/*
	 * Question: You are given a list of numbers, and you need to find all pairs of
	 * numbers in the list that sum up to a given target value. Implement a function
	 * that takes a list of numbers and a target value as input and returns a list
	 * of pairs that satisfy the sum condition.
	 */
	
	public static List<List<Integer>> findPairsWithSum(List<Integer> nums, int target) {
        List<List<Integer>> response = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for(int num:nums){
            int diff = target - num;
            set.add(diff);
        }
        
        for(int num:nums){
             int diff = target - num;
            if(set.contains(diff)){
                List<Integer> list = new ArrayList<>();
                list.add(num);
                list.add(diff);
                response.add(list);
            }
        }
        return response;
        
    }

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int target = 10;
        List<List<Integer>> pairs = findPairsWithSum(nums, target);
        System.out.println("Pairs with sum " + target + ": " + pairs);
    }
}
