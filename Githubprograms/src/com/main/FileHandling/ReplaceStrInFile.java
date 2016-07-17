package com.main.FileHandling;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ReplaceStrInFile {
	

		
	
	public static void main(String[] args) throws IOException {
FileInputStream in = new FileInputStream("C:\\Users\\sridhar\\Desktop\\IO Demo\\file.txt");
BufferedInputStream buff = new BufferedInputStream(in);

Scanner scan = new Scanner(buff);
String s1 = scan.nextLine();

 String rep = s1.replaceAll("kanchana", "ranga");
System.out.println("the string before replace: " + s1);
System.out.println("the string after replace: "+ rep);
scan.close();
}
}
