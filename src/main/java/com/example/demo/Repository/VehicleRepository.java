package com.example.demo.Repository;


import com.example.demo.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
//crud operation

}
