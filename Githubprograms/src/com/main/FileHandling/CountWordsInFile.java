package com.main.FileHandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;


public class CountWordsInFile {
	public static void main(String[] args) throws IOException {
FileInputStream file = new FileInputStream("C:\\Users\\sridhar\\Desktop\\IO Demo\\file.txt");
Scanner scan = new Scanner(file);

int count = 0;
while(scan.hasNext()){
	scan.next();
	count++;
}

System.out.println("the number of words in a file is :"+ count);

scan.close();
}
}
		
