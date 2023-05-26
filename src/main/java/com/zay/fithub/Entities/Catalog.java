package com.zay.fithub.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import java.util.Objects;
import org.springframework.data.mongodb.core.mapping.Document;



@Table
@Document(collection = "catalogs")
@Entity
public class Catalog {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private String id;
    private String nom;
    @ManyToMany
    private Product products;


    public Catalog() {
    }

    public Catalog(String id, String nom, Product products) {
        this.id = id;
        this.nom = nom;
        this.products = products;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Product getProducts() {
        return this.products;
    }

    public void setProducts(Product products) {
        this.products = products;
    }

    public Catalog id(String id) {
        setId(id);
        return this;
    }

    public Catalog nom(String nom) {
        setNom(nom);
        return this;
    }

    public Catalog products(Product products) {
        setProducts(products);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Catalog)) {
            return false;
        }
        Catalog catalog = (Catalog) o;
        return id == catalog.id && Objects.equals(nom, catalog.nom) && Objects.equals(products, catalog.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom, products);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", nom='" + getNom() + "'" +
            ", products='" + getProducts() + "'" +
            "}";
    }


}

