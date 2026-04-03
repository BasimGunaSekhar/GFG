package com.easy;

public class CheckPrime {
	public static void main(String[] args) {
		System.out.println(prime(55));
	}
	public static boolean prime(int n) {
		if (n <= 1)
			return false;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
