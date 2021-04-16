package com.jay.carinfoservice;

import com.jay.model.Car;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/cars")
public class CarInfoService {

    @RequestMapping(value = "/{carId}")
    public Car getCarInfo(@PathVariable ("carId") String carId){
        return new Car(carId,"Lamborghini");
    }
}
