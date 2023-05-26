package com.zay.fithub.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "carts")
@Entity
@Table
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private int quantity;
    private double total;
    @ManyToOne
    private Set<User> users = new HashSet<>();
    @ManyToMany
    private Set<Product> products = new HashSet<>();


    public Cart() {
    }

    public Cart(String id, int quantity, double total, Set<User> users, Set<Product> products) {
        this.id = id;
        this.quantity = quantity;
        this.total = total;
        this.users = users;
        this.products = products;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotal() {
        return this.total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Set<User> getUsers() {
        return this.users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public Set<Product> getProducts() {
        return this.products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    public Cart id(String id) {
        setId(id);
        return this;
    }

    public Cart quantity(int quantity) {
        setQuantity(quantity);
        return this;
    }

    public Cart total(double total) {
        setTotal(total);
        return this;
    }

    public Cart users(Set<User> users) {
        setUsers(users);
        return this;
    }

    public Cart products(Set<Product> products) {
        setProducts(products);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Cart)) {
            return false;
        }
        Cart cart = (Cart) o;
        return id == cart.id && quantity == cart.quantity && total == cart.total && Objects.equals(users, cart.users) && Objects.equals(products, cart.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, quantity, total, users, products);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", quantity='" + getQuantity() + "'" +
            ", total='" + getTotal() + "'" +
            ", users='" + getUsers() + "'" +
            ", products='" + getProducts() + "'" +
            "}";
    }

}

