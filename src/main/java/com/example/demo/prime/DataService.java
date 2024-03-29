package com.example.demo.prime;

import org.springframework.stereotype.Service;

@Service
public class DataService {

    public boolean isPrime(int number) {
        if (number < 0) {
            throw new InvalidNumberException();
        }
        if (number < 2) {
            return false;
        }
        int sqrt = (int) Math.sqrt(number);
        for (int i = 2; i <= sqrt; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
