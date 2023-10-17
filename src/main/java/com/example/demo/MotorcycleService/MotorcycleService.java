package com.example.demo.MotorcycleService;

import com.example.demo.Repository.VehicleRepository;
import com.example.demo.model.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class MotorcycleService {
    @Autowired
    private VehicleRepository vehicleRepository;

    public Vehicle createmotorcycle(Vehicle vehicle){
       return vehicleRepository.save(vehicle);
    }


}
