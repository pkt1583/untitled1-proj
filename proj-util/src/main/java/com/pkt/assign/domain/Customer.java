package com.pkt.assign.domain;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by pankaj on 11/22/14.
 */
public class Customer {
    private CustomerProfile customerProfile;
    private PaymentMethod payment;
    private Set<Bill> bills = new LinkedHashSet<Bill>();

    public PaymentMethod getPayment() {
        return payment;
    }

    public void setPayment(PaymentMethod payment) {
        this.payment = payment;
    }

    public CustomerProfile getCustomerProfile() {
        return customerProfile;
    }

    public void setCustomerProfile(CustomerProfile customerProfile) {
        this.customerProfile = customerProfile;
    }

    public Set<Bill> getBills() {
        return bills;
    }

    public void setBills(Set<Bill> bills) {
        this.bills = bills;
    }

    public void addBill(Bill bill) {
        this.bills.add(bill);
    }
}
