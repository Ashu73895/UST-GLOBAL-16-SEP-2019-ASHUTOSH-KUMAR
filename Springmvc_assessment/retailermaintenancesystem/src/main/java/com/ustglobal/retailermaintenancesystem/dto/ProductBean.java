package com.ustglobal.retailermaintenancesystem.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import net.bytebuddy.build.ToStringPlugin.Exclude;

@Entity
@Table(name="product")
public class ProductBean {
	@Id
	@Column
	private int orderId;
	@Column
	private String name;
	@Column
	private int price;
	@Column
	private int quantity;
	@Column
	private int amountPay;
	@Column
	private int rId;
	@Exclude
	@OneToOne(mappedBy="product")
	private RetailerBean retailer;
	
	public int getrId() {
		return rId;
	}
	public void setrId(int rId) {
		this.rId = rId;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getAmountPay() {
		return amountPay;
	}
	public void setAmountPay(int amountPay) {
		this.amountPay = amountPay;
	}
	public RetailerBean getRetailer() {
		return retailer;
	}
	public void setRetailer(RetailerBean retailer) {
		this.retailer = retailer;
	}
	
	
	
	
	

}
