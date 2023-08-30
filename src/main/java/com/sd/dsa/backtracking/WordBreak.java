package com.sd.dsa.backtracking;
import java.util.*;
public class WordBreak {
    public static boolean wordBreak(String s, List<String> wordDict) {
    	Map<String,Boolean> memo = new HashMap<>();
        return dfs(s,wordDict,0,memo);
    }
    
    public static boolean dfs(String s, List<String> wordDict, int start,Map<String,Boolean> memo){
        if(start==s.length()){
            return true;
        }
        if(memo.get(s+"-"+start)!=null) {
        	return memo.get(s+"-"+start);
        }
        
        for(String word:wordDict){
            int end = start+word.length();
            if(end<=s.length() && s.substring(start,end).equals(word)){
                if(dfs(s,wordDict,end,memo)){ 
                	memo.put(s+"-"+start, true);
                    return true;
                } else {
                	memo.put(s+"-"+start, false);
                }
            }
        }
        return false;
    }

    
    
    
    
    public static void main(String[] args) {
        String s = "leetcode";
        List<String> wordDict = Arrays.asList("leet", "code");
        boolean isValid = wordBreak(s, wordDict);
        System.out.println("Is the word valid: " + isValid);
        String s2 = "catsandog";
        List<String> wordDict2 = List.of("cats", "dog", "sand", "and", "cat");
        System.out.println("Is the word valid (s2): " + wordBreak(s2, wordDict2)); // false

    }
}
