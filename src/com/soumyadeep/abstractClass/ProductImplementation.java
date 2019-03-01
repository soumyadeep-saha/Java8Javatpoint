package com.soumyadeep.abstractClass;

import java.util.ArrayList;
import java.util.List;

public class ProductImplementation {

	public static void main(String[] args) {

		Category cat1 = new Category();
		cat1.setCategoryId("cid1");
		cat1.setCategoryName("cname1");

		Category cat2 = new Category();
		cat1.setCategoryId("cid1");
		cat1.setCategoryName("cname1");
		
		List<Category> list = new ArrayList<>();
		list.add(cat1);
		list.add(cat2);
		
		Item item1 = new Item();
		item1.setItemId("iid1");
		item1.setItemName("iname1");
		
		Product p1 = new Product("pid1","pid2",item1,list);
		
		System.out.println(p1);
		
		item1.setItemId("122344");
		
		System.out.println(p1);
		
		
	}
}
