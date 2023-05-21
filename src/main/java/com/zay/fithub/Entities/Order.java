package com.zay.fithub.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.util.Objects;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "orders")
@Entity
@Table
public class Order {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String firstName;
    @ManyToOne
    private Cart cart;


    public Order() {
    }

    public Order(int id, String firstName, Cart cart) {
        this.id = id;
        this.firstName = firstName;
        this.cart = cart;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Cart getCart() {
        return this.cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public Order id(int id) {
        setId(id);
        return this;
    }

    public Order firstName(String firstName) {
        setFirstName(firstName);
        return this;
    }

    public Order cart(Cart cart) {
        setCart(cart);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Order)) {
            return false;
        }
        Order order = (Order) o;
        return id == order.id && Objects.equals(firstName, order.firstName) && Objects.equals(cart, order.cart);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, cart);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", firstName='" + getFirstName() + "'" +
            ", cart='" + getCart() + "'" +
            "}";
    }
}