package com.gabor.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.gabor.domain.Cars;
import com.gabor.domain.Motorcycle;
import com.gabor.domain.Vehicle;

public class Main {
	
	public static void main(String[] args) {
		
		List<Vehicle> vehicles = createVehicle();

		ColorChecker colorChecker = new ColorChecker("red");
		PowerChecker powerChecker = new PowerChecker(51);
				
		int number = typeOfNumber(vehicles, colorChecker);
		int numberOfPower = typeOfNumber(vehicles, powerChecker);
		
		System.out.println("Number of red: " + number);
		System.out.println("Number of the vehicles which the power is grater than 50: " + numberOfPower);
	}

	public static Integer typeOfNumber(List<Vehicle> collection, IChecker checker)
	{
		int i = 0; 
		for(Vehicle vehicle : collection)
		{
			if(checker.isTrue(vehicle))
			{
				i++;
			}
		}
		return i;
		
	}
	
//	private static List<Vehicle> createVehicle()
//	{
//		Cars car1 = new Cars("red");
//		Cars car2 = new Cars("blue");
//		Cars car3 = new Cars("green");
//		Cars car4 = new Cars("red");
//		Motorcycle cycle1 = new Motorcycle("green");
//		Motorcycle cycle2 = new Motorcycle("green");
//		Motorcycle cycle3 = new Motorcycle("red");
//		Motorcycle cycle4 = new Motorcycle("red");
//		
//		List<Vehicle> vehicles = new ArrayList<Vehicle>(Arrays.asList(car1, car2,car3,car4, cycle1, cycle2, cycle3, cycle4));
//		
//		//rawtype?? https://docs.oracle.com/javase/tutorial/java/generics/rawTypes.html
//		return new ArrayList<Vehicle>(Arrays.asList(car1, car2,car3,car4, cycle1, cycle2, cycle3, cycle4));
//	}
	
	private static <K extends Vehicle> List<K> createVehicle()
	{
		Cars car1 = new Cars("red",1100);
		Cars car2 = new Cars("blue",1256);
		Cars car3 = new Cars("green",526);
		Cars car4 = new Cars("red",920);
		Motorcycle cycle1 = new Motorcycle("green",1125);
		Motorcycle cycle2 = new Motorcycle("green",1235);
		Motorcycle cycle3 = new Motorcycle("red",255);
		Motorcycle cycle4 = new Motorcycle("red",50);
		
		//rawtype?? https://docs.oracle.com/javase/tutorial/java/generics/rawTypes.html
		return new ArrayList(Arrays.asList(car1, car2,car3,car4, cycle1, cycle2, cycle3, cycle4));
	}
}
