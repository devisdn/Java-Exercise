package com.example.bookstore.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.*;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "orders")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"orderDate"}, allowGetters = true)
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orderId", nullable = false)
    private Long orderId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @Column(name = "order_date", nullable = false, updatable = false)
    @Temporal(TemporalType.DATE)
    private Date orderDate;
    
    @Column(name = "total_order", nullable = false)
    private BigDecimal totalOrder;
    
    public Order() {

    }
    
    public Order(Customer customer, Date orderDate, BigDecimal totalOrder) {
        this.customer = customer;
        this.orderDate = orderDate;
        this.totalOrder = totalOrder;
    }

    public Long getOrderId() {
        return orderId;
    }
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public Date getOrderDate() {
        return orderDate;
    }
    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
    public BigDecimal getTotalOrder() {
        return totalOrder;
    }
    public void setTotalOrder(BigDecimal totalOrder) {
        this.totalOrder = totalOrder;
    }
}