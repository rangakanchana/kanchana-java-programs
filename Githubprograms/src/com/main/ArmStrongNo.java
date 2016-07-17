package com.main;

import java.util.Scanner;

public class ArmStrongNo {
	public static void main(String[] args) {
		int n,r,temp,sum=0;
		Scanner in = new Scanner(System.in);
		System.out.println("enter the number to check if it is Armstrong no");
		 n = in.nextInt();
		 temp=n;
		 while(temp!=0){
			 r=temp%10;      //if n=temp=153; then r=153%10=3;
			 sum=sum+r*r*r;  //sum=0+27=27;
			 temp=temp/10;   //temp=153/10=15(coz integer dont take decimals);
			  }
		 in.close();
	//again temp=15,r=15%10=5;sum=27+125=152; then temp=15/10=1;
    //again temp=1,r=1,sum=152+1=153;
		 if(n==sum){
			 System.out.println("the entered number is an Armstrong number");
			  }else{
			 System.out.println("the entered number is not an Armstrong number");
			  }
		}
	

}
