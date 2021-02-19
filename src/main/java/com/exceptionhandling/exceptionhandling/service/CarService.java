package com.exceptionhandling.exceptionhandling.service;

import com.exceptionhandling.exceptionhandling.dto.Car;
import com.exceptionhandling.exceptionhandling.exception.EntityNotfoundException;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Service;

@Service
public class CarService {
    private static List<Car> carList = new ArrayList<>();

    @PostConstruct 
    public void init() {
        carList.add(new Car("Mercedes", "C200"));
        carList.add(new Car("BMW", "M2"));
        carList.add(new Car("Audi", "TT"));
    }

    public Car getCar(String name) {
        if (name.startsWith("1")) { //1 ile başlayan araba için exception handling
            throw new IllegalArgumentException();
        }
        return carList.stream().filter(item -> item.getName().equals(name)).findFirst()
                .orElseThrow(() -> new EntityNotfoundException(name));
    }
}