package com.jay.java.FirstSpringRest;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Address {


    private String state;
    private String city;
    private String Country;
    @NotEmpty
    @Size(min = 3)
    private long zip;

    public Address(String state, String city, String country, long zip) {
        this.state = state;
        this.city = city;
        Country = country;
        this.zip = zip;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public long getZip() {
        return zip;
    }

    public void setZip(long zip) {
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "Address{" +
                "state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", Country='" + Country + '\'' +
                '}';
    }
}
