package com.sd.dsa.mustdo.strings;
public class Anagram {
    public static void main(String args[]) {
     String a = "allergy", b = "allergic";
     
     int[] arr = new int[26];
     boolean isAnagram = true;
     for(char c:a.toCharArray()){
         arr[c-'a']++;
     }
     
     for(char c:b.toCharArray()){
         if(arr[c-'a']==0){
             isAnagram = false;
             break;
         }
     }
     System.out.println("isAnagram "+isAnagram);
     
    }
}