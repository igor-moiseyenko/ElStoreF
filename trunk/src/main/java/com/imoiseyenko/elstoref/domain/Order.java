package com.imoiseyenko.elstoref.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="\"Order\"", schema="dbo")
public class Order extends DomainObject {

	private static final long serialVersionUID = 1L;
	
	@OneToMany(mappedBy="order", cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private List<OrderItem> orderItems;
	
	private Date date;
	private double totalAmount;
	private String state;
	
	public Order () {}
	
	public void addOrderItem (OrderItem orderItem) {
		
		orderItem.setOrder(this);
		this.orderItems.add(orderItem);
	}
	
	public void removeOrderItem (OrderItem orderItem) {
		
		this.orderItems.remove(orderItem);
		orderItem.setOrder(null);
	}
	
	public Date getDate () {
	
		return date;
	}
	
	public void setDate (Date date) {
	
		this.date = date;
	}
	
	public double getTotalAmount () {
	
		return totalAmount;
	}
	
	public void setTotalAmount (double totalAmount) {
	
		this.totalAmount = totalAmount;
	}
	
	public String getState () {
	
		return state;
	}
	
	public void setState (String state) {
	
		this.state = state;
	}

	@Override
	public boolean equalsByFields (Object obj) {

		if (this == obj) {
			
			return true;
		}
		if ((obj == null) || (obj.getClass() != this.getClass())) {
			
			return false;
		}
		
		Order other = (Order) obj;
		
		if (this.date.equals(other.date)
				&& this.totalAmount == other.totalAmount
				&& this.state.equals(other.state)
				&& this.orderItems.equals(other.orderItems)) {
			
			return true;
		}
		
		return false;
	}
}
