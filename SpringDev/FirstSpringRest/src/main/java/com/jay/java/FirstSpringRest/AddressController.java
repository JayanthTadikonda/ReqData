package com.jay.java.FirstSpringRest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Min;
import java.util.ArrayList;

@RestController
public class AddressController {

    @GetMapping(value = "add/{zipcode}")
    public ResponseEntity<Void> getAddressByZip(@PathVariable ("zipcode") @Min(3)int zip){

        System.out.println("Entered ZIP-Code: " + zip);
        ResponseEntity<Void> entity = null;

        Address address1 = new Address("Adawo","Shanghai","China",345);
        Address address2 = new Address("Ohio","LA","Africa",222);
        Address address3 = new Address("ntario","SA","America",377);
        Address address4 = new Address("ntarasaio","SA","America",3);


        ArrayList<Address> addressArrayList = new ArrayList<>();
        addressArrayList.add(address1);
        addressArrayList.add(address2);
        addressArrayList.add(address3);
        addressArrayList.add(address4);

        //addressArrayList.stream().forEach(address -> System.out.println(address.toString()));

        for (Address a: addressArrayList) {
            if(a.getZip() == zip){
                System.out.println(a.toString());
                break;
            }else
               entity = new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return entity;
    }
}
