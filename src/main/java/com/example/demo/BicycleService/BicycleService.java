package com.example.demo.BicycleService;

import com.example.demo.Repository.VehicleRepository;
import com.example.demo.model.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BicycleService {
    @Autowired
    private VehicleRepository vehicleRepository;


    public Vehicle createbicycle(Vehicle vehicle){
        return vehicleRepository.save(vehicle);
    }
}
