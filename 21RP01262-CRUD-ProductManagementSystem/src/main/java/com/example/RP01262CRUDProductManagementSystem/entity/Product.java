package com.example.RP01262CRUDProductManagementSystem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private long id;
	private String pname;
	private String pmarc;
	private String psize;
	private String price;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPmarc() {
		return pmarc;
	}
	public void setPmarc(String pmarc) {
		this.pmarc = pmarc;
	}
	public String getPsize() {
		return psize;
	}
	public void setPsize(String psize) {
		this.psize = psize;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	

}
