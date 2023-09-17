package com.sd.dsa.dp;
import java.util.*;
public class DistinctLetterPartitioning {
	
	
	/**
	 * Problem: You are given a string s containing only lowercase letters. You need
	 * to partition s into as many parts as possible so that each letter appears in
	 * at most one part, and then return a list of integers representing the lengths
	 * of these parts.
	 * 
	 * Input:
	 * 
	 * A string of lowercase letters, String s, where 1 <= s.length <= 1000. Output:
	 * 
	 * A list of integers representing the lengths of the partitioned parts.
	 * Example:
	 * 
	 * 
	 */
	
	
	
		
    public static void main(String args[]) {
    String s = "abcde";
    System.out.println("response = "+partitionLabels(s));
    }
    
    public static List<Integer> partitionLabels(String s) {
        List<Integer> result = new ArrayList<>();
        int[] lastOccurence = new int[26];
        
        for(int i=0;i<s.length();i++){
            lastOccurence[s.charAt(i)-'a'] = i;
        }
        
        int start = 0;
        int end = 0;
        for(int i=0;i<s.length();i++){
            end = Math.max(end,lastOccurence[s.charAt(i)-'a']);
            
            if(i==end){
                result.add(end-start+1);
                start = end+1;
            }
            
            
        }
         return result;
    }
    
   

}