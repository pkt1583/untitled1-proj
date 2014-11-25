package com.pkt.assign.domain;

/**
 * Created by pankaj on 23-11-2014.
 */
public class WaterBillUnit extends BillUnit {
    private String description = "Water Bill Unit";

    @Override
    public String getDescription() {
        return this.description;
    }
}
