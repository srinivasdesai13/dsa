package com.sd.dsa.backtracking;
import java.util.*;
public class NumberToCharDecoding {
	
	/*
	 * Question: You are given a string containing only digits, and you want to
	 * count the number of ways to decode the string into letters. Each letter is
	 * mapped to a number ('A' to '1', 'B' to '2', ..., 'Z' to '26'). Write a
	 * function to find the total number of ways to decode the given string.
	 */

	 public static void main(String args[]) {
	      numDecodings("202");
	    }
	    
	    
	    public static int numDecodings(String s){
	        //226
	        // 2 26 B Z
	        // 2 2 6 BBF
	        // 22 6    VF
	        Map<Integer,Character> map = new HashMap<>();
	        int cnt = 1;
	        for(char c='A';c<='Z';c++){
	            map.put(cnt,c);
	            cnt++;
	        }
	        System.out.println(map);
	        List<String> response = new ArrayList<>();
	        dfs(s,response,new StringBuilder(),0,map);
	        System.out.println("response "+response);
	        return -1;
	        
	    }
	    
		public static void dfs(String s, List<String> response, StringBuilder builder, int index,
				Map<Integer, Character> map) {

			if (index == s.length()) {
				response.add(builder.toString());
				return;
			}

			char c = s.charAt(index);
			if (c != '0') {
				builder.append(map.get(Integer.parseInt("" + c)));
				dfs(s, response, builder, index + 1, map);
				builder.deleteCharAt(builder.length() - 1);
			}

			if (index + 1 < s.length()) {
				int k = Integer.parseInt(s.substring(index, index + 2));
				if ( k < 27) {
					builder.append(map.get(k));
					dfs(s, response, builder, index + 2, map);
					builder.deleteCharAt(builder.length() - 1);
				}
			}

		}

}
