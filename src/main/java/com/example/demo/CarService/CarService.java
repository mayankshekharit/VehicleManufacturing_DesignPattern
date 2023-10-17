package com.example.demo.CarService;

import com.example.demo.Repository.VehicleRepository;
import com.example.demo.model.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CarService {
    @Autowired
    private VehicleRepository vehicleRepository;
 public Vehicle CreateCar(Vehicle vehicle){
     return vehicleRepository.save(vehicle);
 }
}


