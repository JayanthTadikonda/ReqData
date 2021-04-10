package com.jay.java.FirstSpringRest;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.ParseException;
import org.springframework.expression.ParserContext;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;
import java.awt.*;
import java.util.ArrayList;

@RestController
public class CreditCardController {


    @GetMapping(value = "/card/{number}/{name}")
    public CreditCardModel validateCard(@Valid @PathVariable ("number") long number, @Valid @PathVariable("name") String name){

        ArrayList<CreditCardModel> creditCardModels = new ArrayList<>();
        CreditCardModel c1 = new CreditCardModel(6011051111111111l,"Visa");
        creditCardModels.add(c1);

        System.out.println("Entered Credit card Number: " + number);
        System.out.println("Card Name: " + name);

        String sixDigits = Long.toString(number).substring(0,6);
        long six = Long.parseLong(sixDigits);

        if(six>=601100 && six<=601109){
            System.out.println("Valid");
        }
        else System.out.println("Invalid Card");
            return creditCardModels.get(0);
    }

    @PutMapping(value = "/new-card", consumes = MediaType.APPLICATION_JSON_VALUE)
    public CreditCardModel validateCard(@Valid @RequestBody CreditCardModel name){

        ArrayList<CreditCardModel> creditCardModels = new ArrayList<>();
        CreditCardModel c1 = new CreditCardModel(6011051111111111l,"Visa");
        creditCardModels.add(c1);

        CreditCardModel c2 = new CreditCardModel(name.getNumber(), name.getName());

        System.out.println("Entered Credit card Number: " + name.getNumber());
        System.out.println("Card Name: " + name.getName());

        String sixDigits = Long.toString(name.getNumber()).substring(0,6);
        long six = Long.parseLong(sixDigits);

        if(six>=601100 && six<=601109){
            System.out.println("Valid");
        }
        else System.out.println("Invalid Card");
        return name;
    }
}
