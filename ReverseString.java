package com.easy;

public class ReverseString {
	public static void main(String[] args) {
		System.out.println(revStr("Guna Sekhar"));
	}
	public static String revStr(String s) {
		StringBuilder res = new StringBuilder();
		for (int i = s.length() - 1; i >= 0; i--) {
			res.append(s.charAt(i));
		}
		return new String(res);
	}
}
