package com.pkt.assign.domain;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by pankaj on 11/22/14.
 */
public class Customer {
    private CustomerProfile customerProfile;
    private Payment payment;
    private Set<Bill> bills=new LinkedHashSet<Bill>();

    public CustomerProfile getCustomerProfile() {
        return customerProfile;
    }

    public void setCustomerProfile(CustomerProfile customerProfile) {
        this.customerProfile = customerProfile;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Set<Bill> getBills() {
        return bills;
    }

    public void setBills(Set<Bill> bills) {
        this.bills = bills;
    }

    public void addBill(Bill bill){
        this.bills.add(bill);
    }
}
