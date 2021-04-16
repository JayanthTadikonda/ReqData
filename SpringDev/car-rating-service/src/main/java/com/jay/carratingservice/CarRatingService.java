package com.jay.carratingservice;

import com.jay.model.Rating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class CarRatingService {

    @RequestMapping("/{carId}")
    public Rating getRating(@PathVariable ("carId") String carId){

        return new Rating(carId,5);
    }

}
