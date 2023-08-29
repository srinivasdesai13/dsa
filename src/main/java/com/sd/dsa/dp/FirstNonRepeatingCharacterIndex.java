package com.sd.dsa.dp;

public class FirstNonRepeatingCharacterIndex {
	
	/*
	 * Question: You are given a string containing only lowercase letters. You need
	 * to find the first non-repeating character in the string and return its index.
	 * If there is no such character, return -1.
	 * 
	 */
    public static int firstUniqChar(String s) {
       int[] arr = new int[26];
       
       char[] charr = s.toCharArray();
       for(char c:charr){
           arr[c-'a']++;
       }
       for(int i=0;i<charr.length;i++){
           if(arr[charr[i]-'a']==1){
               return i;
           }
       }
       return -1;
    }

    public static void main(String[] args) {
        String input = "lleetcode";
        int result = firstUniqChar(input);
        System.out.println("Index of the first non-repeating character: " +result);
    }
}
