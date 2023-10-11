package com.sd.dsa.mustdo.strings;
public class RomansToIntegers {
	
	
	/**
	 * Given a string in roman no format (s)  your task is to convert it to an integer . Various symbols and their values are given below.
I 1
V 5
X 10
L 50
C 100
D 500
M 1000
	
	
	
	
	*/
	
	
	
    public static void main(String args[]) {
        char[] arr = {'I','V','X','L','C','D','M'};
        int[] num = {1, 5,10,50,100,500,1000};
        
        int input = 123;
        
         int index = 0;
         StringBuilder output = new StringBuilder();
         while(input>0){
             
             while(input>=num[index]){
                 index++;
             }
             
             output.append(arr[index-1]);
             input-=num[index-1];
             System.out.println(input);
             index = 0;
             
             
         }
        
        System.out.println(output.toString());
    }
}