package com.main;

import java.util.Scanner;

public class Pingpong {
	public static void main(String[] args) {

	for(int i =1;i<100;i++){
		if(i%3==0 && i%5==0){
			System.out.println("ping pong");
		}
			else if(i%3==0){
		System.out.println("ping");
	}
	else if(i%5==0){
		System.out.println("pong");
		}
	 
	else
	{System.out.println(i + " ");
}
}
	/*Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number: ");
	int n = sc.nextInt();
	if(n%3==0 && n%5==0){
		System.out.println("ping pong");
	}else if(n%3==0){
		System.out.println("ping");
	}else if(n%5==0){
		System.out.println("pong");
	}else
		System.out.println(n);*/
	
	
}
}

