package com.main.collections;

import java.util.HashMap;

public class HashMapEx {

	public static void main(String[] args) {
HashMap<Integer,String> hs = new HashMap<>();
hs.put(2, "book");
hs.put(4, "paper");
hs.put(5, "pencil");
hs.put(3, "pen");

String s1=hs.get(2);
String s2=hs.get(5);
System.out.println("the value of the given key is:"+ " "+ s1);
System.out.println("the value of the given key is:"+" " + s2);
}
}
