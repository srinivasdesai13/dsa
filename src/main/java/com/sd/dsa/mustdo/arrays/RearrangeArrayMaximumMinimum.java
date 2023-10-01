package com.sd.dsa.mustdo.arrays;

public class RearrangeArrayMaximumMinimum {

	public static void main(String[] args) {

		/*
		 * Given a sorted array of positive integers. Your task is to rearrange the
		 * array elements alternatively i.e first element should be max value, second
		 * should be min value, third should be second max, fourth should be second min
		 * and so on. Note: Modify the original array itself. Do it without using any
		 * extra space. You do not have to return anything.
		 * 
		 */
		int[] arr = { 1,2,3,4,5,6 };

		int max = arr[arr.length - 1] + 1;
		System.out.println("max = " + max);
		int minIdx = 0;
		int maxIdx = arr.length - 1;
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				arr[i] = arr[i] + (arr[maxIdx] % max) * max;
				
				maxIdx--;
			} else {
				arr[i] = arr[i] + (arr[minIdx] % max) * max;
				minIdx++;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]/max );
		}

	}

}
