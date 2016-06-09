package com.gabor.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import com.gabor.domain.Cars;
import com.gabor.domain.Motorcycle;
import com.gabor.domain.Vehicle;

public class Main {

	public static <K extends Vehicle, Z extends Collection<K>> void main(String[] args) {
		Z vehicles = createVehicle();
		
		Vehicle vehicle = new Vehicle();
		ColorChecker colorChecker = new ColorChecker<K>();
				
		int number = vehicle.numberOfCarsBasicOfColor(vehicles, colorChecker);
		
		System.out.println("Number of red: " + number);
	}

	
	private static <K extends Vehicle, Z extends Collection<K>> Z createVehicle()
	{
		Cars car1 = new Cars("red");
		Cars car2 = new Cars("blue");
		Cars car3 = new Cars("green");
		Cars car4 = new Cars("red");
		Motorcycle cycle1 = new Motorcycle("green");
		Motorcycle cycle2 = new Motorcycle("green");
		Motorcycle cycle3 = new Motorcycle("red");
		Motorcycle cycle4 = new Motorcycle("red");
		
		//Z vehicles = (Z) new ArrayList<Vehicle>(Arrays.asList(car1, car2,car3,car4, cycle1, cycle2, cycle3, cycle4)); Miért kell a castolás a <Vehicle> helyett miért nem lehet K
		
		List<K> vehicles = new ArrayList(Arrays.asList(car1, car2,car3,car4, cycle1, cycle2, cycle3, cycle4));
		
		return (Z) vehicles;
	}
}
