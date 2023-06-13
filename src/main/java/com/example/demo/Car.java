package com.example.demo;

class Car extends Vehicle implements CarControl {
    protected String model;
    public Car(String brand, String vin, String model) {
        super(brand, vin);
        this.model = model;
    }
    
    public void carBrand() {
    	System.out.println("Regular car brand is " + brand);
    }
    
    public void move() {}
    
    public void frontLight(boolean status) {
    	if(status) {
    		System.out.println("Turend on front lights!");
    	} else {
    		System.out.println("Turend off front lights!");
    	} 
    }

	@Override
	protected void honk() {}

	@Override
	protected void batteryStatus() {}

}
