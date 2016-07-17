package com.main.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListEx {
public static void main(String[] args) {
	
ArrayList<String> al = new ArrayList<String>();
al.add("ramya");
al.add("rina");
al.add("prabha");
al.add("chandana");

// to search an element
boolean bl = al.contains("rina");
System.out.println("does the arraylist contains rina: "+ bl);

//print data using itereator

Iterator<String> itr = al.iterator();
while(itr.hasNext())
	{
	String s = itr.next();
	System.out.println("the elements of the list is:" + s);
}
// print data in reverse order using ListItereator

ListIterator <String> lstr = al.listIterator();
while(lstr.hasNext()){
	String s1 = lstr.next();
	System.out.println("the elements of the list are:" +s1);
	}
while(lstr.hasPrevious()){
	String s2 = lstr.previous();
	System.out.println("The elements in the reverse order: "+ s2);
}
}
}


