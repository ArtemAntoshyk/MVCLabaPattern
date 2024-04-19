package org.example.mvcpatternlaba.controller;

import org.example.mvcpatternlaba.dao.UniversalCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/main")
public class PageController {

    private final UniversalCard universalCard;
    @Autowired
    public PageController(UniversalCard universalCard){
        this.universalCard = universalCard;
    }

    @GetMapping()
    public String index(){
        return "/indx";
    }
    @GetMapping("/card")
    public String showCard(Model model, @RequestParam(name = "type") String type){
        System.out.println(type);
        String text = universalCard.getCarByType(type).showInfo();
        model.addAttribute("card", universalCard.getCarByType(type));
        return "/cards/universalcard";
    }
}
