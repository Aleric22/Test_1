package com.esun.espbackend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="LiKe_List")
public class SearchEntity {
    @Id
	@Column(name = "Product_Name")
	String Product_Name;

	@NotNull
    @Column(name = "Account")
    String Account;
	
    @Column(name = "Total_Amount")
    String Total_Amount;
	
    @Column(name = "Total_Fee")
    String Total_Fee;
    
    @Column(name = "Email")
    String Email;

	public String getProduct_Name() {
		return Product_Name;
	}
	
	public String getAccount() {
		return Account;
	}
	
	public String Total_Amount() {
		return Total_Amount;
	}
	
	public String getTotal_Fee() {
		return Total_Fee;
	}
    
	public String getEmail() {
		return Email;
	}
	
	public void setProduct_Name(String Product_Name) {
		this.Product_Name = Product_Name;
	}
	
	public void setAccount(String Account) {
		this.Account = Account;
	}
	
	public void setTotal_Amount(String Total_Amount) {
		this.Total_Amount = Total_Amount;
	}
	
	public void setTotal_Fee(String Total_Fee) {
		this.Total_Fee = Total_Fee;
	}
    
	public void setEmail(String Email) {
		this.Email = Email;
	}
	
}
