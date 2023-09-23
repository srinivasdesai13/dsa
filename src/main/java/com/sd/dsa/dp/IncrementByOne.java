package com.sd.dsa.dp;

public class IncrementByOne {
	public static void main(String args[]) {
		int[] arr = { 8, 9, 9 };
		int[] response = increment(arr);
		for (int i = 0; i < response.length; i++) {
			System.out.println("response[i] = " + response[i]);
		}

	}

	public static int[] increment(int[] digits) {

		int carry = 0;
		for (int i = digits.length - 1; i >= 0; i--) {
			if (digits[i] == 9) {
				digits[i] = 0;
				++carry;
				continue;
			}

			digits[i] = ++digits[i];
			carry = 0;
			break;
		}

		if (carry > 1) {
			int[] response = new int[digits.length + 1];
			for (int i = 0; i < response.length; i++) {
				if (i == 0) {
					response[i] = 1;
				}
			}
			return response;
		} else {
			return digits;
		}

	}
}
