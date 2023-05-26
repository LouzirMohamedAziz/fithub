package com.zay.fithub.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

import java.util.Objects;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "orders")
@Entity
@Table
public class Order {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private String id;
    @OneToOne
    private Cart cart;


    public Order() {
    }

    public Order(String id, Cart cart) {
        this.id = id;
        this.cart = cart;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Cart getCart() {
        return this.cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public Order id(String id) {
        setId(id);
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
        return Objects.equals(id, order.id) && Objects.equals(cart, order.cart);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cart);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", cart='" + getCart() + "'" +
            "}";
    }


}