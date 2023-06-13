package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	
	public static void superclassMethods(Vehicle vehicle) {
        vehicle.frontLight(true);
        vehicle.batteryStatus();
    }

	public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Car("Jaguar", "TRUWT28N651011265", "F-PACE");
        vehicles[1] = new Car("Nissan", "1FAFP13P1WW137478", "Skyline");
        vehicles[2] = new ElectricCar("Tesla", "JH4DA1850HS006058", "Model X", 150);

        for (Vehicle vehicle : vehicles) {
        	superclassMethods(vehicle);
        }
    }

}
