package com.niit.shopingcart.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name = "product")
@Component
public class Product {

	@Transient
    private MultipartFile itemImage;


	public MultipartFile getItemImage() {
		return itemImage;
	}
	public void setItemImage(MultipartFile itemImage) {
		this.itemImage = itemImage;
	}
	@Id
	private String  id;
	private String name;
	private String description;
	private double price;
	private String category_id;
	public String getCategory_id() {
		return category_id;
	}
	public void setCategory_id(String category_id) {
		this.category_id = category_id;
	}
	public String getSupplier_id() {
		return supplier_id;
	}
	public void setSupplier_id(String supplier_id) {
		this.supplier_id = supplier_id;
	}
	private String supplier_id;
 
	
	@ManyToOne
    @JoinColumn(name="category_id",  nullable = false, updatable = false, insertable = false)
	private Category category;
	
	
	@ManyToOne
    @JoinColumn(name="supplier_id", nullable = false, updatable = false, insertable = false)
	private Supplier supplier;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public Supplier getSupplier() {
		return supplier;
	}
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	

}