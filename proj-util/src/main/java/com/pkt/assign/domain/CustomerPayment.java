package com.pkt.assign.domain;

/**
 * Created by pankaj on 23-11-2014. This could also support one customer to multiple payment in future
 */
public class CustomerPayment {
    private Customer customer;
    private Payment payment;

    public CustomerPayment(Customer customer, Payment payment) {
        this.customer = customer;
        this.payment = payment;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
