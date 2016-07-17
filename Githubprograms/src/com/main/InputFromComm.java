package com.main;

import java.util.Scanner;


public class InputFromComm {
	//input from command line or command prompt using scanner
     public static void main(String[] args) {
   Scanner scan = new Scanner(System.in);
   System.out.println("Reading the input from command line using scanner in java");
   System.out.println("Enter the input:");
   String input = scan.nextLine();
   System.out.println("user input from console:"+input);
   System.out.println("Enter the number:");
   int num = scan.nextInt();
   System.out.println("User input from console:"+num);
   scan.close();
}
}

