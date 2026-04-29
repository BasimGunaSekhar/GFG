package com.easy;

public class Lcm {
	public static void main(String[] args) {
		System.out.println(LCM(5,10));
	}
	public static int LCM(int a, int b) {
	    return (a*b)/GCD(a,b);
	}
	public static int GCD(int a,int b){
	    if(b==0)return a;
	    return GCD(b,a%b);
	}
}
