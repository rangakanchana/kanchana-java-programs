package com.main.FileHandling;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileEx {
	public static void main(String[] args)   {
try {
FileInputStream in = new FileInputStream("C:\\Users\\sridhar\\Desktop\\IO Demo\\file.txt");
FileOutputStream out = new FileOutputStream("C:\\Users\\sridhar\\Desktop\\IO Demo\\file2.txt");

byte [] b = new byte[4096];
int byteread;
while((byteread=in.read(b))!=-1){
	out.write(b, 0, byteread);
}
in.close();
out.close();
System.out.println("File copied successfully");
}
	catch(Exception e){
		
}
}
}

