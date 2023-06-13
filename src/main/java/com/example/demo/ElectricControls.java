package com.example.demo;

public interface ElectricControls {
	void activeHeatControl();

    default void carLock(boolean status, String code) {
    	if(status && code.contentEquals("AB45TR2")) {
    		System.out.println("Car unlocked");
    	} else {
    		System.out.println("Car locked");
    	} 
        
    }

    static void activeSignaling() {
        System.out.println("Signaling!");
    }
}
