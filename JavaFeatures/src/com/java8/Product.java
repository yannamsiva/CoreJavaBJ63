package com.java8;

public class Product {
private int id;
private String pname;
private int qty;
private int price;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public int getQty() {
	return qty;
}
public void setQty(int qty) {
	this.qty = qty;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public Product(int id, String pname, int qty, int price) {
	super();
	this.id = id;
	this.pname = pname;
	this.qty = qty;
	this.price = price;
}
public Product() {
	super();
	// TODO Auto-generated constructor stub
}

}
