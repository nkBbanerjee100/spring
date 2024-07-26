package com.springcore.lifecycle;

public class BeanXml {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting property price");
		this.price = price;
	}

	public BeanXml() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "BeanXml [price=" + price + "]";
	}
	// naming doesn't matter whatever name I give I have to give that name to init-method
	public void init() {
		System.out.println("Init method");
	}
	
	public void destroy() {
		System.out.println("Destroy method");
	}
	
}
