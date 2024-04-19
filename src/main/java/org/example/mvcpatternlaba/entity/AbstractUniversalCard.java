package org.example.mvcpatternlaba.entity;

import java.util.Date;

public abstract class AbstractUniversalCard implements UniversalCard {
    private String ownerFullName;
    private Date dateOfBirthday;

    public AbstractUniversalCard(String ownerFullName, Date dateOfBirthday) {
        this.ownerFullName = ownerFullName;
        this.dateOfBirthday = dateOfBirthday;
    }

    public String getOwnerFullName() {
        return ownerFullName;
    }

    public Date getDateOfBirthday() {
        return dateOfBirthday;
    }

    @Override
    public String showInfo() {
        return "Owner: " + ownerFullName + " data of birthday: " + dateOfBirthday;
    }
}
