package com.jay.model;

public class CarCatalog {

    private String carId;
    private String model;
    private int rating;

    public CarCatalog() {
    }

    public CarCatalog(String carId, String model, int rating) {
        this.carId = carId;
        this.model = model;
        this.rating = rating;
    }
}
