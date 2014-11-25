package com.pkt.assign.domain;

/**
 * Created by pankaj on 23-11-2014.
 */
public class ElecticityBillUnit extends BillUnit {
    private String description = "Electricity Bill Unit";

    @Override
    public String getDescription() {
        return description;
    }
}
