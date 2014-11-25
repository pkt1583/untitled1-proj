package com.pkt.assign.domain;


import org.joda.money.Money;

/**
 * Created by pankaj on 23-11-2014.
 */
public abstract class BillUnit {
    private Integer numberOfUnits;

    private Money perUnitPrice;

    public Integer getNumberOfUnits() {
        return numberOfUnits;
    }

    public void setNumberOfUnits(Integer numberOfUnits) {
        this.numberOfUnits = numberOfUnits;
    }

    public Money getPerUnitPrice() {
        return perUnitPrice;
    }

    public void setPerUnitPrice(Money perUnitPrice) {
        this.perUnitPrice = perUnitPrice;
    }

    public Money getAmountToBePaid() {
        return perUnitPrice.multipliedBy(numberOfUnits);
    }

    public abstract String getDescription();
}
