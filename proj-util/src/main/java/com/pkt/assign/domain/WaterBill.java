package com.pkt.assign.domain;

/**
 * Created by pankaj on 23-11-2014.
 */
public class WaterBill extends Bill {
    private WaterBillUnit waterBillUnit = new WaterBillUnit();

    @Override
    public BillUnit getBillUnit() {
        return waterBillUnit;
    }
}
