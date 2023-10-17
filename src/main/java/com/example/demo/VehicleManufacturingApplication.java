package com.example.demo;

import com.example.demo.Repository.VehicleRepository;
import com.example.demo.model.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VehicleManufacturingApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(VehicleManufacturingApplication.class, args);

	}
	@Autowired
   public VehicleRepository vehicleRepository;

	@Override
	public void run(String... args) throws Exception {
		Vehicle vehicle =new Vehicle();
		vehicle.setType("Car");
		vehicle.setModel("Sedan");
		vehicle.setColor("Red");
		vehicleRepository.save(vehicle);
//Testing examples
		Vehicle vehicle2 =new Vehicle();
		vehicle2.setType("Car");
		vehicle2.setModel("SUV");
		vehicle2.setColor("blue");
		vehicleRepository.save(vehicle2);

	}
}
