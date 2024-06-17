package com.esun.espbackend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="Product")
public class DeleteEntity {
    @Id
	@Column(name = "Product_Name")
	String Product_Name;

	@NotNull
    @Column(name = "Price")
    String Price;
	
    @Column(name = "Fee_Rate")
    String Fee_Rate;

	public String getProduct_Name() {
		return Product_Name;
	}
	
	public String getPrice() {
		return Price;
	}
	
	public String getFee_Rate() {
		return Fee_Rate;
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

}
