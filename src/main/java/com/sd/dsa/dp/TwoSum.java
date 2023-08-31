package com.sd.dsa.dp;
import java.util.*;
public class TwoSum {
   
	/*
	 * Question: You are given a list of integers and an integer target. Write a
	 * function to determine if there are two distinct indices i and j in the list
	 * such that nums[i] + nums[j] equals the target. If such indices exist, return
	 * them as an array; otherwise, return an empty array.
	 */

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println("Indices of the two numbers: [" + result[0] + ", " + result[1] + "]");
    }
    
     public static int[] twoSum(int[] nums, int target) {
       Map<Integer,Integer> map = new HashMap<>();
       int[] resp = new int[2];
       for(int i=0;i<nums.length;i++){
           int diff = target-nums[i];
           if(map.get(nums[i])!=null){
               resp[0] = i;
               resp[1] = map.get(nums[i]);
           }
           map.put(diff,i);
       }
       return resp;
    }
}
