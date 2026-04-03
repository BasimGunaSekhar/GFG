package com.easy;

public class VowelOrNot {
	public static void main(String[] args) {
		System.out.println(isVowel('z'));
	}
	public static String isVowel(char c) {
		String s = c + "";
		s = s.toLowerCase();
		if (s.equals("a") || s.equals("e") || s.equals("i") || s.equals("o") || s.equals("u")) {
			return "YES";
		} else {
			return "NO";
		}
	}

}
