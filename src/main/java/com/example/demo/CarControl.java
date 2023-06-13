package com.example.demo;

public interface CarControl {
	
	static void openDoor(int doorCode) {
		System.out.println("Opened " + doorCode + " door!");
	}

    default void stop() {
        System.out.println("Vehicle stopped.");
    }

    static void honk() {
        System.out.println("Honk!");
    }
    
    static void frontLight(boolean status) {
    	if(status) {
    		System.out.println("Turend on front lights!");
    	} else {
    		System.out.println("Turend off front lights!");
    	} 
    }
    
    static void backLight(boolean status) {
    	if(status) {
    		System.out.println("Turend on back lights!");
    	} else {
    		System.out.println("Turend off back lights!");
    	} 
    }
    
    static void turnOnLeftIndicator() {}
    
    static void turnOffLeftIndicator() {}
    
    void move();
}
