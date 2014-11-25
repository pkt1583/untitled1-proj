package com.pkt.assign.domain;

/**
 * Created by pankaj on 23-11-2014.
 */
public class ElectricityBill extends Bill {
    private ElecticityBillUnit electicityBillUnit = new ElecticityBillUnit();

    @Override
    public BillUnit getBillUnit() {
        return electicityBillUnit;
    }
}
