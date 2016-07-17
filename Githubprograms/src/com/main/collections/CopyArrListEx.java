package com.main.collections;

import java.util.ArrayList;

public class CopyArrListEx {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<>();
		al.add("Book");
		al.add("pencil");
		al.add("pen");
		al.add("erasor");
		System.out.println("Elements of Arraylist are: ");
		System.out.println(al);
		
		String[]s = new String[al.size()];
		al.toArray(s);
		System.out.println("the copied array is: ");
		for(String s1:al){
			System.out.println( s1);
		}
		}
}
