package com.main;

import java.util.Scanner;

public class PrimeCheck {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number:");
    int n = sc.nextInt();
    sc.close();
    int count=0;
    for(int i = 2;i<=n/2;i++){
    	if(n%i==0){
    		count = 1;
    		break;

    	}
   }
    	if(count==1){
    		System.out.println(n +" " +"is not a prime number");

    }else{
    		System.out.println(n +" "+" is a prime number");
    	}
    	}
    }




