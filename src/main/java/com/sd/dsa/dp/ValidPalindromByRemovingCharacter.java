package com.sd.dsa.dp;

public class ValidPalindromByRemovingCharacter {
	
	/**
	 * 
	 * Problem: You are given a string s containing only lowercase letters. You want
	 * to determine if s is a palindrome after removing at most one character. A
	 * palindrome is a word that reads the same backward as forward.
	 * 
	 * Input:
	 * 
	 * A string of lowercase letters, String s, where 1 <= s.length <= 10^5. Output:
	 * 
	 * A boolean value indicating whether s can become a palindrome by removing at
	 * most one character.
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean response = validPalindrom("raceabcar");
		System.out.println("response "+response);
	}
	
	
	
	public static boolean validPalindrom(String s) {
		
		int l = 0,r = s.length()-1;
		int removedCharacters = 0;
		while(l<r) {
			
			if(s.charAt(l)!=s.charAt(r)) {
				if(removedCharacters==1) {
					return false;
				}
				++removedCharacters;
				
				String afterRemovingLeftChar = s.substring(0,l)+s.substring(l+1,s.length());
				String afterRemovingRightChar = s.substring(0,r)+s.substring(r+1,s.length());
				
				boolean response = isValidPalindrome(afterRemovingLeftChar) || isValidPalindrome(afterRemovingRightChar);
				
				return response;
			}
			
			l++;
			r--;
			
		}
		return true;
		
	}
	
	public static boolean isValidPalindrome(String s) {
		int l = 0,r = s.length()-1;
		while(l<r) {
			if(s.charAt(l)!=s.charAt(r)) {
				return false;
			}
			l++;
			r--;
		}
		return true;
	}

}
