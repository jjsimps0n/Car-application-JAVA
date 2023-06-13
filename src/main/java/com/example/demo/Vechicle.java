package com.example.demo;

abstract class Vehicle {
    protected String brand;
    protected String vin;

    public Vehicle(String brand, String vin) {
        this.brand = brand;
        this.vin = vin;
    }

    public abstract void carBrand();

	protected abstract void frontLight(boolean b);

	protected abstract void honk();

	protected abstract void batteryStatus();

}
