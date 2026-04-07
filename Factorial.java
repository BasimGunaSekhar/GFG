package com.easy;

public class Factorial {
	public static void main(String[] args) {
		System.out.println(nFactorial(10));
	}
	public static int nFactorial(int n) {
		int ans = 1;
		for (int i = n; i >= 1; i--) {
			ans = ans * i;
		}
		return ans;
	}
}
