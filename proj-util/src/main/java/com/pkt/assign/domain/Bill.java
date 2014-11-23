package com.pkt.assign.domain;

/**
 * Created by pankaj on 23-11-2014.
 */
public class Bill {
    private BillUnit billUnit;
    private Customer customer;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public BillUnit getBillUnit() {
        return billUnit;
    }

    public void setBillUnit(BillUnit billUnit) {
        this.billUnit = billUnit;
    }
}
