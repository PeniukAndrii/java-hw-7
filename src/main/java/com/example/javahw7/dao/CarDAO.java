package com.example.javahw7.dao;

import com.example.javahw7.models.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface CarDAO extends JpaRepository<Car,Integer> {
}
