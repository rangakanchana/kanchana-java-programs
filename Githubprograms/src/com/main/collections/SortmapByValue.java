package com.main.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortmapByValue {
	
public static void main(String a[]){
 Map<String, Integer> map = new HashMap<String, Integer>();
 map.put("Pencil", 15);
 map.put("Pen", 25);
 map.put("Erasor", 21);
 map.put("scale", 43);
 map.put("book", 7);
 map.put("notes", 13);
 Set<Entry<String, Integer>> set = map.entrySet();
 List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(set);
 Collections.sort( list, new Comparator<Map.Entry<String, Integer>>()
 {
public int compare( Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2 )
	{
	return (o1.getValue()).compareTo( o2.getValue() );
	  }
	  } );
  for(Map.Entry<String, Integer> entry:list){
 System.out.println(entry.getKey()+"......"+entry.getValue());
	        }
	    }
}
