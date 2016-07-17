package com.strings;

public class SubstringEx {
	public static void main(String[] args) {
		String str = "Hello Kanchana";
		String str1 = str.replaceAll("Kanchana", "Geetha");
		
		System.out.println("Before replace"+" "+ str);
		System.out.println("after replace"+" "+ str1);
}
}