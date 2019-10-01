package com.example.demo.prime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeController {

    @Autowired
    private DataService service;

    @RequestMapping("/prime")
    public PrimeRepresentation prime(@RequestParam("number") int number) {
        boolean prime = service.isPrime(number);
        return new PrimeRepresentation(number, prime);
    }
}
