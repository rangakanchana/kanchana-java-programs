package com.main;

public class FibonacciNum {
		//fibonacci numbers to 100
		// 1 1 2 3 5 8 13 21 34 55 89 
	public static void main(String[] args) {

		int k ;
		int a = 1;
		int b = 1;
		System.out.print("1 1 ");
		for(k=0;k<=100;k++){
			k=a+b;
			System.out.print(k + " ");
			a=b;
			b=k;
		}
	}


//using while loop
	/*public static void main(String[] args) {
		int k,a,b;
		k=0;
		a=0;
		b=1;
		System.out.print("0 1 ");
		while(k<=100){
			k=a+b;
			System.out.print(k + " ");
			a=b;
			b=k;
			}
		}*/
		}
