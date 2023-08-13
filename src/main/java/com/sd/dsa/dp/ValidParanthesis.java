package com.sd.dsa.dp;

import java.util.*;
public class ValidParanthesis {

	public static void main(String args[]) {
	      System.out.println("response = "+isValid("{"));
	    }
	    
	    public static boolean isValid(String str){
	        char[] arr = str.toCharArray();
	        
	        Stack<Character> stack = new Stack<>();
	        for(char c:arr){
	            
	            if(c == '(' || c=='[' || c=='{'){
	                stack.push(c);
	            }
	            
	            if(!stack.isEmpty()){
	                char peek = stack.peek();
	                if(c==')' && peek=='('){
	                    stack.pop();
	                } else if(c==']' && peek=='['){
	                    stack.pop();
	                } else if(c=='}' && peek=='{'){
	                    stack.pop();
	                }
	            } else {
	                stack.push(c);
	            }
	            
	            
	        }
	        
	        return stack.isEmpty();
	    }
}
