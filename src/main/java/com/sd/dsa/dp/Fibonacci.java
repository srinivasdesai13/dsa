package com.sd.dsa.dp;

public class Fibonacci {
	
	/*
	 * Certainly! Here's a Dynamic Programming question for you:

Problem: Calculate the nth Fibonacci number using Dynamic Programming.
	*/
	public static void main(String args[]) {
		int response = calculateFibonacciUsingRecursion(6);
		System.out.println("response " + response);
	}

	public static int calculateFibonacci(int n) {
		int n1 = 0;
		int n2 = 1;
		int sum = 0;
		while (n - 1 > 0) {

			sum = n1 + n2;
			n1 = n2;
			n2 = sum;

			System.out.println("n=" + n + ",  n1=" + n1 + ",  n2=" + n2);
			n--;
		}
		return sum;

	}
	
	public static int calculateFibonacciUsingRecursion(int n) {
	    if (n <= 1) {
	        return n;
	    }
	    
	    return calculateFibonacciUsingRecursion(n - 1) + calculateFibonacciUsingRecursion(n - 2);
	}

}