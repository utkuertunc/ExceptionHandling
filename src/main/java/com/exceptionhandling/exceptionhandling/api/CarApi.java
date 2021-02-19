package com.exceptionhandling.exceptionhandling.api;

import com.exceptionhandling.exceptionhandling.dto.Car;
import com.exceptionhandling.exceptionhandling.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/car")
public class CarApi {

    @Autowired
    private CarService carService;

    @GetMapping
    public ResponseEntity<Car> getCar(@RequestParam String name) {
        return ResponseEntity.ok(carService.getCar(name));
    }

    /**  THIS PART FOR LOCAL EXCEPTIONS
    @ExceptionHandler({EntityNotfoundException.class})
    public String entityNotFound() {
        return "Record not found";
    }
    **/
}