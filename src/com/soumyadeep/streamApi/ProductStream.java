package com.soumyadeep.streamApi;

public class ProductStream {
	
	public int id;
	public String name;
	public float price;
	
	public ProductStream(int id, String name, float price) {
		
		this.id=id;
		this.name=name;
		this.price=price;
	}

	/*@Override
	public String toString() {
		return "ProductStream [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
*/
}
