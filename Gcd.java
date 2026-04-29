package com.easy;

public class Gcd {
	public static void main(String[] args) {
		Gcd gcd=new Gcd();
		System.out.println(gcd.computeGCD(3, 9));
	}
	public int computeGCD(int a, int b) {
		if (b == 0)return a;
		return computeGCD(b, a % b);
	}

}
