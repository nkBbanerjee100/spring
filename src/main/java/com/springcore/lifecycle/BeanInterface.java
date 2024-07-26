package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanInterface implements InitializingBean,DisposableBean {
	private double priceNew;

	public double getPriceNew() {
		return priceNew;
	}

	public void setPriceNew(double priceNew) {
		System.out.println("setting price");
		this.priceNew = priceNew;
	}

	@Override
	public String toString() {
		return "BeanInterface [priceNew=" + priceNew + "]";
	}

	public BeanInterface() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Interface wala init method");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Interface wala destroy method");
	}
}	
