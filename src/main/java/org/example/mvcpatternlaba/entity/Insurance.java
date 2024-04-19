package org.example.mvcpatternlaba.entity;

import java.util.Date;

public class Insurance extends AbstractUniversalCard{
    public long policyNumber;

    public Insurance(String ownerFullName, Date dateOfBirthday, long policyNumber) {
        super(ownerFullName, dateOfBirthday);
        this.policyNumber = policyNumber;
    }

    public long getPolicyNumber() {
        return policyNumber;
    }

    @Override
    public String showInfo() {
        return super.showInfo() + " number of policy: " + policyNumber;
    }
}
