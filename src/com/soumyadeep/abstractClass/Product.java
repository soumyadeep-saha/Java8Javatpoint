package com.soumyadeep.abstractClass;

import java.util.List;

public final class Product {
	
	final private String id;
	final private String name;
	final private Item item;
	final private List<Category> category;
	
	public Product(String id, String name, Item item, List<Category> category) {
		super();
		this.id = id;
		this.name = name;
		this.item = item;
		this.category = category;
	}
	
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
