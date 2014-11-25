package com.pkt.assign.domain;

/**
 * Created by pankaj on 23-11-2014. This could also support one customer to multiple payment in future
 */
public class BillPayment {
    private Payment payment;
    private Bill bill;

    public BillPayment(Payment payment, Bill bill) {

        this.payment = payment;
        this.bill = bill;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
