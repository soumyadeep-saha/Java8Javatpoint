package com.soumyadeep.forEach;

import java.util.HashMap;
import java.util.Map;

public class ForEachToIterateMap {

	public static void main(String[] args) {

		Map<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(1, "Monkey");
		hmap.put(2, "Dog");
		hmap.put(3, "Cat");
		hmap.put(4, "Lion");
		hmap.put(5, "Tiger");
		hmap.put(6, "Bear");
		
		hmap.forEach((k,v)-> System.out.println(k + " : "+v));
	}
}
