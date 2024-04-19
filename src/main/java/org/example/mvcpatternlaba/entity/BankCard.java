package org.example.mvcpatternlaba.entity;

import org.springframework.stereotype.Component;

import java.util.Date;

public class BankCard extends AbstractUniversalCard{
    private String  numberOfCard;

    public BankCard(String ownerFullName, Date dateOfBirthday, String numberOfCard) {
        super(ownerFullName, dateOfBirthday);
        this.numberOfCard = numberOfCard;
    }

    public String getNumberOfCard() {
        return numberOfCard;
    }

    @Override
    public String showInfo() {
        return super.showInfo() + " number of card: " + numberOfCard;
    }
}
