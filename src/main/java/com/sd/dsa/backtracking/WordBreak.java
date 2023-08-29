package com.sd.dsa.backtracking;
import java.util.*;
public class WordBreak {
    public static boolean wordBreak(String s, List<String> wordDict) {
        return dfs(s,wordDict,0);
    }
    
    public static boolean dfs(String s, List<String> wordDict, int start){
        if(start==s.length()){
            return true;
        }
        
        
        for(String word:wordDict){
            int end = start+word.length();
            if(end<=s.length() && s.substring(start,end).equals(word)){
                if(dfs(s,wordDict,end)){
                    return true;
                }
            }
        }
        return false;
    }

    
    public static boolean dfs(String s, List<String> wordDict){
        if(s.length()==0){
            return true;
        }
        for(String word:wordDict){
            if(s.startsWith(word)){
                s= s.substring(word.length(),s.length());
                if(dfs(s,wordDict)){
                    return true;
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
