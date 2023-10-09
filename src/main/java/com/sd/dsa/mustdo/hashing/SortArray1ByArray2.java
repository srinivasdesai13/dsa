package com.sd.dsa.mustdo.hashing;
import java.util.*;
public class SortArray1ByArray2 {
    
	/**
	 * 
	 * Given two integer arrays A1[ ] and A2[ ] of size N and M respectively. Sort the first array A1[ ] such that all the relative positions of the elements in the first array are the same as the elements in the second array A2[ ].
See example for better understanding.

N = 11 
M = 4
A1[] = {2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8}
A2[] = {2, 1, 8, 3}
Output: 
2 2 1 1 8 8 3 5 6 7 9
	
	
	*/
	
	public static void main(String args[]) {
    	
    	
    	
     int[] arr1= {2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8};
     Arrays.sort(arr1);
     int[] arr2= {99, 22, 444, 56};
     Map<Integer,Integer> map = new HashMap<>();
     
     for(int num:arr1){
         map.put(num,1+map.getOrDefault(num,0));
     }
     
     Map<Integer,Integer> map2 = new HashMap<>();
     
     for(int num:arr2){
         map2.put(num,1+map2.getOrDefault(num,0));
     }
     
     int[] response = new int[arr1.length];
     int index = 0;
     for(int num:arr2){
         if(map.containsKey(num)){
             int count = map.get(num);
             
             while(count>0){
                 response[index] = num;
                 index++;
                 count--;
             }
         }
     }
     
     
     for(int i=0;i<arr1.length;i++){
         if(map2.containsKey(arr1[i])){
             continue;
         }
         System.out.println("arr1[i]"+arr1[i]);
         response[index] = arr1[i];
         index++;
     }
     
     for(int i=0;i<response.length;i++){
         System.out.println("response["+i+"]"+response[i]);
     }
     
     
    }
}