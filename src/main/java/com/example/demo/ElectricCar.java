package com.example.demo;

class ElectricCar extends Car implements ElectricControls {
    private int batteryCapacity;

    public ElectricCar(String brand, String vin, String model, int batteryCapacity) {
        super(brand, vin, model);
        this.batteryCapacity = batteryCapacity;
    }

    public void carBrand() {
        System.out.println("Electric car brand is " + brand);
    }
    
    public void batteryStatus() {
        System.out.println("Current battery capacity:  " + batteryCapacity);
    }

	@Override
	public void activeHeatControl() {}
}
