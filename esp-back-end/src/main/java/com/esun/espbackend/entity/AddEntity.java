package com.esun.espbackend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.persistence.Id;

@Entity
@Table(name = "User")
public class AddEntity {
	@Id
	@Column(name = "Product_Name")
	String Product_Name;
	
	@NotNull
    @Column(name = "Price")
    String Price;
	
    @Column(name = "Fee_Rate")
    String Fee_Rate;
	
    @Column(name = "Account")
    String Account;
	
    @Column(name = "Order_Name")
    String Order_Name;

	public String getProduct_Name() {
		return Product_Name;
	}
	
	public String getPrice() {
		return Price;
	}
	
	public String getFee_Rate() {
		return Fee_Rate;
	}
	
	public String getAccount() {
		return Account;
	}
	
	public String getOrder_Name() {
		return Order_Name;
	}
	
	public void setProduct_Name(String Product_Name) {
		this.Product_Name = Product_Name;
	}
	
	public void setPrice(String Price) {
		this.Price = Price;
	}
	
	public void setFee_Rate(String Fee_Rate) {
		this.Fee_Rate = Fee_Rate;
	}
	
	public void setAccount(String Account) {
		this.Account = Account;
	}
	
	public void setOrder_Name(String Order_Name) {
		this.Order_Name = Order_Name;
	}
	
}
