package com.tj.SpringRestTemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;

@RestController
public class CalculatorController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping(value ="/add/{a1}/{a2}")
    public Integer add(@PathVariable ("a1") int a, @PathVariable ("a2") int b){

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.ALL));
        HttpEntity<Integer> entity = new HttpEntity<Integer>(headers);
        Integer sum;
        sum = restTemplate.exchange("http://localhost:9090/add/1/2", HttpMethod.GET, entity, Integer.class).getBody();

        System.out.println("Sum of 2 Numbers: " + sum);
        return sum;
    }

    @GetMapping(value = "/multiply/{a1}/{a2}")
    public int multiply(@PathVariable ("a1") int a, @PathVariable ("a2") int b){
        System.out.println("Multiplication of 2 Numbers: " + a*b);
        return a*b;
    }

    @GetMapping(value = "/sub/{a1}/{a2}")
    public int subtract(@PathVariable ("a1") int a, @PathVariable ("a2") int b){
        System.out.println("Subtraction of 2 Numbers: " + (a-b));
        return a-b;
    }

    @GetMapping(value = "/div/{a1}/{a2}")
    public int division(@PathVariable ("a1") int a, @PathVariable ("a2") int b){
        if(b==0){
            System.out.println("Division by ZERO is undefined");
        }
        System.out.println("Division of 2 Numbers: " + a/b);
        return a/b;
    }
}
