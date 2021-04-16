package com.jay.carcatalogservice;

import com.jay.model.CarCatalog;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping(value = "/carCatalog")
public class CarCatalogService {

    @RequestMapping(value = "/{carId}")
    public List<CarCatalog> getCatalog(@PathVariable ("carId") String Id){

        return Collections.singletonList(new CarCatalog("Lamborghini","Perfomante",5));
    }

}
