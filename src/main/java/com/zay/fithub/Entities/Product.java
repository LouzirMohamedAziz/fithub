package com.zay.fithub.Entities;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Document(collection = "products")
@Entity
@Table
public class Product {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String title;
    private String description;
    private String price;


    public Product() {
    }

    public Product(int id, String title, String description, String price) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.price = price;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return this.price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Product id(int id) {
        setId(id);
        return this;
    }

    public Product title(String title) {
        setTitle(title);
        return this;
    }

    public Product description(String description) {
        setDescription(description);
        return this;
    }

    public Product price(String price) {
        setPrice(price);
        return this;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", title='" + getTitle() + "'" +
            ", description='" + getDescription() + "'" +
            ", price='" + getPrice() + "'" +
            "}";
    }

}