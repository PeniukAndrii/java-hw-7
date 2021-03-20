package com.example.javahw7.controllers;

import com.example.javahw7.dao.CarDAO;
import com.example.javahw7.models.Car;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@RestController
@RequestMapping("/cars")
@CrossOrigin(origins = {"http://localhost:4200"})
public class CarControllers {
    private CarDAO carDAO;

    @PostMapping("/save")
    private void save(@RequestBody Car car){
        carDAO.save(car);
    }

    @GetMapping()
    private List<Car> findAll(){
        return carDAO.findAll();
    }

    @GetMapping("/{id}")
    private Optional<Car> getCar(@PathVariable int id){
        return carDAO.findById(id);
    }

    @DeleteMapping("/{id}")
    private void deleteCar(@PathVariable int id){
        carDAO.deleteById(id);
    }

}

