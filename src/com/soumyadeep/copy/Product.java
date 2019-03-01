package com.soumyadeep.copy;

import java.util.List;

public final class Product {

	final private String id;
	final private String name;
	final private Item item;
	final private List<Category> category;

	/*
	 * Shallow Copy
	 * 
	 * Whenever we use default implementation of clone method we get shallow copy of
	 * object means it creates new instance and copies all the field of object to
	 * that new instance and returns it as object type, we need to explicitly cast
	 * it back to our original object. This is shallow copy of the object. clone()
	 * method of the object class support shallow copy of the object. If the object
	 * contains primitive as well as nonprimitive or reference type variable in
	 * shallow copy, the cloned object also refers to the same object to which the
	 * original object refers as only the object references gets copied and not the
	 * referred objects themselves. That’s why the name shallow copy or shallow
	 * cloning in Java. If only primitive type fields or Immutable objects are there
	 * then there is no difference between shallow and deep copy in Java.
	 * filter_none edit play_arrow
	 * 
	 * brightness_4 //code illustrating shallow copy public class Ex {
	 * 
	 * private int[] data;
	 * 
	 * // makes a shallow copy of values public Ex(int[] values) { data = values; }
	 * 
	 * public void showData() { System.out.println( Arrays.toString(data) ); } }
	 */
	public Product(String id, String name, Item item, List<Category> category) {
		super();
		this.id = id;
		this.name = name;
		Item item2 = new Item();
		item2.setItemId(item.getItemId());
		item2.setItemName(item.getItemName());
		this.item = item2;
		this.category = category;
	}
	
	/*
	 * Deep Copy
	 * 
	 * Whenever we need own copy not to use default implementation we call it as
	 * deep copy, whenever we need deep copy of the object we need to implement
	 * according to our need. So for deep copy we need to ensure all the member
	 * class also implement the Cloneable interface and override the clone() method
	 * of the object class. A deep copy means actually creating a new array and
	 * copying over the values.
	 * 
	 * filter_none edit play_arrow
	 * 
	 * brightness_4 // Code explaining deep copy public class Ex {
	 * 
	 * private int[] data;
	 * 
	 * // altered to make a deep copy of values public Ex(int[] values) { data = new
	 * int[values.length]; for (int i = 0; i < data.length; i++) { data[i] =
	 * values[i]; } }
	 * 
	 * public void showData() { System.out.println(Arrays.toString(data)); } }
	 */

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Item getItem() {
		return item;
	}

	public List<Category> getCategory() {
		return category;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", item=" + item + ", category=" + category + "]";
	}
}
