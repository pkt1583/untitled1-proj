package com.pkt.assign.domain;

/**
 * Created by pankaj on 23-11-2014.
 */
public class GasBillUnit extends BillUnit {
    private String description = "Gas Bill Unit";

    @Override
    public String getDescription() {
        return this.description;
    }
}
