package com.Infinite.inventoryproject;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="orders")

public class Order {
	
	@Id
	@Column(name="OrderId")
	private String orderId;
	
	@Column(name="customerid")
	private int customerId;
	
	@Column(name="StockID")
	private String stockId;
	
	@Column(name="vendorid")
	private String vendorid;
	
	@Enumerated(EnumType.STRING)
	@Column(name="Orderstatus")
	private OrderStatus orderStatus;
	
	@Column(name="QtyOrd")
	private  int quantityOrder;
	
	@Column(name="OrderedDate")
	private Date orderedDate;
	
	@Column(name="Price")
	private int price;
	
	@Column(name="shipping_address1")
	private String shippingAddress1;
	
	@Column(name="shipping_address2")
	private String shippingAddress2;
	
	@Column(name="city")
	private String city;
	
	@Column(name="zipcode")
	private String zipcode;
	
	@Column(name="shipping")
	private Date shippingDate;
	
	@Column(name="delivery")
	private Date deliveryDate;
	
	@Column(name="expected_delivery")
	private Date expecteddeliveryDate;
	
	@Column(name="Gbill")
	private int gbill;
	
	
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getStockId() {
		return stockId;
	}
	public void setStockId(String stockId) {
		this.stockId = stockId;
	}
	
	
	public String getVendorid() {
		return vendorid;
	}
	public void setVendorid(String vendorid) {
		this.vendorid = vendorid;
	}
	public OrderStatus getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}
	public int getQuantityOrder() {
		return quantityOrder;
	}
	public void setQuantityOrder(int quantityOrder) {
		this.quantityOrder = quantityOrder;
	}
	public Date getOrderedDate() {
		return orderedDate;
	}
	public void setOrderedDate(Date orderedDate) {
		this.orderedDate = orderedDate;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getShippingAddress1() {
		return shippingAddress1;
	}
	public void setShippingAddress1(String shippingAddress1) {
		this.shippingAddress1 = shippingAddress1;
	}
	public String getShippingAddress2() {
		return shippingAddress2;
	}
	public void setShippingAddress2(String shippingAddress2) {
		this.shippingAddress2 = shippingAddress2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public Date getShippingDate() {
		return shippingDate;
	}
	public void setShippingDate(Date shippingDate) {
		this.shippingDate = shippingDate;
	}
	public Date getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public Date getExpecteddeliveryDate() {
		return expecteddeliveryDate;
	}
	public void setExpecteddeliveryDate(Date expecteddeliveryDate) {
		this.expecteddeliveryDate = expecteddeliveryDate;
	}
	public int getGbill() {
		return gbill;
	}
	public void setGbill(int gbill) {
		this.gbill = gbill;
	}
	
	
	
	

}