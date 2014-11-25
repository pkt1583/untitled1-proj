package com.pkt.assign.domain;

/**
 * Created by pankaj on 23-11-2014.
 */
public class GasBill extends Bill {
    private GasBillUnit gasBillUnit = new GasBillUnit();

    @Override
    public BillUnit getBillUnit() {
        return gasBillUnit;
    }
}
