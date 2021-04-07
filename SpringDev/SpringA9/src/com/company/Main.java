package com.company;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        ExpressionParser parser = new SpelExpressionParser();
        Expression exp = parser.parseExpression("'Hello Spring Beans'".toUpperCase());
        String message = (String) exp.getValue();
        System.out.println(message);

        System.out.println(parser.parseExpression("'Heya Spring Beans'".repeat(3)).getValue());
    }
}
