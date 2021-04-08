package com.jay.java.FirstSpringRest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class AddressController {

    @PutMapping(value = "add/{zipcode}" ,consumes = MediaType.APPLICATION_JSON_VALUE)
    public void getAddressByZip(@PathVariable ("zipcode") int zip){

        System.out.println("Entered ZIP-Code: " + zip);

        Address address1 = new Address("Adawo","Shanghai","China",345);
        Address address2 = new Address("Ohio","LA","Africa",222);
        Address address3 = new Address("ntario","SA","America",377);

        ArrayList<Address> addressArrayList = new ArrayList<>();
        addressArrayList.add(address1);
        addressArrayList.add(address2);
        addressArrayList.add(address3);

        for (Address a: addressArrayList) {
            if(a.getZip() == zip){
                System.out.println(a.toString());
                break;
            }else System.out.println("No Address found with entered ZIP-CODE !");
            break;
        }
    }
}
