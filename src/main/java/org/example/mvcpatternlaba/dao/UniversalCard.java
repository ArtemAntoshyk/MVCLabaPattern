package org.example.mvcpatternlaba.dao;

import org.example.mvcpatternlaba.entity.AbstractUniversalCard;
import org.example.mvcpatternlaba.entity.BankCard;
import org.example.mvcpatternlaba.entity.Insurance;
import org.example.mvcpatternlaba.entity.Passport;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
@Component
public class UniversalCard {
    private ArrayList<AbstractUniversalCard> cards = new ArrayList<>();
    private String owner = "Test";
    private Date dataOfBirthday = new Date(104, 4, 30);

    public UniversalCard() {
        cards.add(new BankCard(owner, dataOfBirthday, "4444 7777 5555 4747"));
        cards.add(new Insurance(owner, dataOfBirthday, 1111));
        cards.add(new Passport(owner, dataOfBirthday, 23442342));
        System.out.println(cards);
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setDataOfBirthday(Date dataOfBirthday) {
        this.dataOfBirthday = dataOfBirthday;
    }

    public AbstractUniversalCard getCarByType(String type) {
        return cards.stream()
                .filter(card -> {
                    String className =  card.getClass().getName().toLowerCase();
                    System.out.println(className);
                    className = className.substring(className.lastIndexOf("." )+ 1);
                    return className.equals(type);
                })
                .findAny().orElse(null);
    }

}
