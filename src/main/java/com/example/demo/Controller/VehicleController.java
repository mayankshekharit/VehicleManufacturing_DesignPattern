package com.example.demo.Controller;

import com.example.demo.Repository.VehicleRepository;
import com.example.demo.VehicleFactory.VehicleFactory;
import com.example.demo.model.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/vehicles")
public class VehicleController {
    @Autowired
    private VehicleRepository vehicleRepository;

    @Autowired
    private VehicleFactory vehicleFactory;
    @GetMapping
    public List<Vehicle> getAllVehicles(){
        return vehicleRepository.findAll();
    }
    @PostMapping
    public Vehicle createVehicle(@RequestBody Vehicle vehicle){
       return vehicleFactory.getVehicle(vehicle);
    }

}
