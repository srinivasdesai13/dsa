package com.sd.dsa.dp;

public class FactorialCalculator {
	public static int calculateFactorial(int n) {
		if (n > 0) {
			return n * calculateFactorial(n - 1);
		}
		return 1;
	}

	public static void main(String[] args) {
		int n = 5;
		int factorial = calculateFactorial(n);
		System.out.println("Factorial of " + n + " is " + factorial);
	}
}
