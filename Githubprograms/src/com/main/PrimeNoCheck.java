package com.main;

import java.util.Scanner;

public class PrimeNoCheck {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number: ");
	int n = sc.nextInt();
	sc.close();
   Boolean isprime = true;
	//int n = 23;
		for(int i =2;i<=n/2;i++){
		if(n%i==0){
			isprime=false;
			break;
			}
			}
		if(isprime){
			System.out.println(n+ " " +"is the  prime number");
			}else{
				System.out.println(n+ " "+ "is not the  prime number");
			}
		
	}
	
	
	
		
}