package com.gabor.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.gabor.domain.Cars;
import com.gabor.domain.Motorcycle;
import com.gabor.domain.Vehicle;

public class Main {

	public static <K extends Vehicle> void main(String[] args) {
		List<K> vehicles = createVehicle();
		
		Vehicle vehicle = new Vehicle();
		
		int number = vehicle.numberOfCarsBasicOfColor(vehicles, "blue");
		
		System.out.println("Number of red: " + number);
	}

	
	private static <K extends Vehicle> List<K> createVehicle()
	{
		Cars car1 = new Cars("red");
		Cars car2 = new Cars("blue");
		Cars car3 = new Cars("green");
		Cars car4 = new Cars("red");
		Motorcycle cycle1 = new Motorcycle("green");
		Motorcycle cycle2 = new Motorcycle("green");
		Motorcycle cycle3 = new Motorcycle("red");
		Motorcycle cycle4 = new Motorcycle("red");
		
		List<K> vehicles = 
				new ArrayList(Arrays.asList(car1, car2,car3,car4, cycle1, cycle2, cycle3, cycle4));
		
		return vehicles;
	}
}
