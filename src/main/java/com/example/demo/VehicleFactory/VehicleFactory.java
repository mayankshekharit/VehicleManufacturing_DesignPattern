package com.example.demo.VehicleFactory;

import com.example.demo.BicycleService.BicycleService;
import com.example.demo.CarService.CarService;
import com.example.demo.CommonConstants;
import com.example.demo.MotorcycleService.MotorcycleService;
import com.example.demo.model.Vehicle;
import com.example.demo.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehicleFactory {

    @Autowired
    private CarService carService;
    @Autowired
    private BicycleService bicycleService;
    @Autowired
    private MotorcycleService motorcycleService;
    public Vehicle getVehicle(Vehicle vehicle){
        if(vehicle.getType().equals(CommonConstants.CAR)){
          return  carService.CreateCar(vehicle);
        } else if (vehicle.getType().equals(CommonConstants.BICYCLE)) {
            return bicycleService.createbicycle(vehicle);
        }
        else if(vehicle.getType().equals(CommonConstants.MOTORCYCLE)){
            return motorcycleService.createmotorcycle(vehicle);
        }
        else{
            throw  new ResourceNotFoundException("Not a valid Vehicle type !");
        }
    }

}
