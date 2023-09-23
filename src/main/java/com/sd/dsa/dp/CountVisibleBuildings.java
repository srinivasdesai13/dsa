package com.sd.dsa.dp;
public class CountVisibleBuildings {
	
	
	/*
	 * Question: You are given an array of integers representing the heights of
	 * buildings. Each integer represents the height of a building. If you are
	 * standing at a building's index, you can see the buildings to its right, but
	 * not to its left. Write a Java method to count how many buildings are
	 * "visible." A building is considered visible if it is strictly taller than all
	 * the buildings to its left.
	 * 
	 * 
	 * int[] heights = {3, 7, 8, 3, 6, 1}; int count =
	 * countVisibleBuildings(heights); // There are 4 visible buildings: 3, 7, 8,
	 * and 6. // So, count should be 4.
	 * 
	 * 
	 * int[] heights1 = {1, 2, 3, 4, 5}; int count1 =
	 * countVisibleBuildings(heights1); // All buildings are visible as they form an
	 * ascending sequence. // So, count1 should be 5.
	 * 
	 * 
	 * int[] heights2 = {5, 4, 3, 2, 1}; int count2 =
	 * countVisibleBuildings(heights2); // Only the first building (height 5) is
	 * visible as it is the tallest. // So, count2 should be 1.
	 * 
	 * 
	 * int[] heights3 = {7, 1, 7, 5, 3, 6}; int count3 =
	 * countVisibleBuildings(heights3); // There are 3 visible buildings: 7, 7, and
	 * 6. // So, count3 should be 3.
	 * 
	 * 
	 * int[] heights4 = {1}; int count4 = countVisibleBuildings(heights4); //
	 * There's only one building, so it is always visible. // So, count4 should be
	 * 1.
	 * 
	 */
	
	
	
	
	
	
	
	
	
	public static void main(String args[]) {
		int[] heights4 = { 1 };
		int count = countVisibleBuildings(heights4);

		System.out.println("response[i] = " + count);

	}
    
    public static int countVisibleBuildings(int[] heights) {
        int max = Integer.MIN_VALUE;
    
        int total = 0;
        
        for(int i=0;i<heights.length;i++){
           
         
            if(heights[i]>=max){
                max = heights[i];
                ++total;
                continue;
            }
            max = heights[i];
        }
        return total;
        
    }

    

}