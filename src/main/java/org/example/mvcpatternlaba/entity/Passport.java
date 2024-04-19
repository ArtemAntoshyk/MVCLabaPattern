package org.example.mvcpatternlaba.entity;

import java.util.Date;

public class Passport extends AbstractUniversalCard{
    private long numberOfPassport;

    public Passport(String ownerFullName, Date dateOfBirthday, long numberOfPassport) {
        super(ownerFullName, dateOfBirthday);
        this.numberOfPassport = numberOfPassport;
    }

    public long getNumberOfPassport() {
        return numberOfPassport;
    }

    @Override
    public String showInfo() {
        return super.showInfo() + " number of passport: " + numberOfPassport;
    }
}
