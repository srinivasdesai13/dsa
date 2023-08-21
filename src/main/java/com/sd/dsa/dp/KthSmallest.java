package com.sd.dsa.dp;
import java.util.*;
public class KthSmallest {
	
	/*
	 * Question: You are given a list of numbers. Write a function to find the "Kth" smallest number in the list, where K is a positive integer.
	*/
	
	 public static int findKthSmallest(int[] nums, int k) {
	        PriorityQueue<Integer> queue = new PriorityQueue<>((a,b) -> a-b);
	        for(int num:nums){
	            queue.offer(num);
	        }
	        int kthsmallest = 0;
	        while(k>0){
	            kthsmallest = queue.poll();
	            k--;
	        }
	        return kthsmallest;
	    }

	    public static void main(String[] args) {
	        int[] nums = { 3, 1, 4, 2, 7, 6, 5 };
	        int k = 3;
	        int kthSmallest = findKthSmallest(nums, k);
	        System.out.println("Kth smallest number: " + kthSmallest);
	    }
	}