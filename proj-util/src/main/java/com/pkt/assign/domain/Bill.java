package com.pkt.assign.domain;

import org.joda.time.DateTime;

/**
 * Created by pankaj on 23-11-2014.
 */
public abstract class Bill {
    private Customer customer;
    private DateTime dueDate;

    public DateTime getDueDate() {
        return dueDate;
    }

    public void setDueDate(DateTime dueDate) {
        this.dueDate = dueDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public abstract BillUnit getBillUnit();

}
