package com.example.bookstore.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class OrderDetailsKey implements Serializable {
    
    private static final long serialVersionUID = -4406662685503410L;

    @Column(name = "bookId")
    Long bookId;

    @Column(name = "orderId")
    Long orderId;

    @Override
    public int hashCode() {
        return Objects.hash(bookId, orderId);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        OrderDetailsKey other = (OrderDetailsKey) obj;
        return Objects.equals(bookId, other.bookId) && Objects.equals(orderId, other.orderId);
    }

}
