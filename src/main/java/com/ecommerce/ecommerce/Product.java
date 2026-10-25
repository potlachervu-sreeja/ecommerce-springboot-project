
package com.ecommerce.ecommerce;

import java.math.BigDecimal;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
@Entity
@Table(name = "products")


public class Product {

	@Id
	@Column(name = "productid")
	private int productid;

	@Column(name = "productname")
	private String productname;

	@Column(name = "description")
	private String description;

	@Column(name = "price")
	private BigDecimal price;

	@Column(name = "stock")
	private int stock;

	@Column(name = "categoryid")
	private int categoryid;
	public Product() {
	}

    public Product(int productid, String productname,
                   String description, BigDecimal price,
                   int stock, int categoryid) {
        this.productid = productid;
        this.productname = productname;
        this.description = description;
        this.price = price;
        this.stock = stock;
        this.categoryid = categoryid;
    }

    public int getProductid() {
        return productid;
    }

    public String getProductname() {
        return productname;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public int getCategoryid() {
        return categoryid;
    }
    public void setProductname(String productname) {
        this.productname = productname;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setCategoryid(int categoryid) {
        this.categoryid = categoryid;
    }
}
