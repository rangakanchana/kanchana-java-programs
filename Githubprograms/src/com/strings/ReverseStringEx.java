package com.strings;

import java.util.Scanner;
public class ReverseStringEx {
	public static void main(String[] args) {
		String original;
		String reverse="";
		System.out.println("Enter the string to reverse:");
		Scanner sc = new Scanner(System.in);
		original = sc.nextLine();
		for(int i=original.length()-1;i>=0;i--){
		reverse = reverse+original.charAt(i);
		}
		System.out.println("original string:"+original);
		System.out.println("Reverse string is "+reverse);
		sc.close();
		}
        }
