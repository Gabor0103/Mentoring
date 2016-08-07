package com.gabor.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.gabor.domain.Car;
import com.gabor.domain.MotorCycle;
import com.gabor.impl.VehicleRetriever;

public class Main {

	public static void main(String[] args) {
		System.out.println("--- 1. exercise ---");
		firstExercise();
		System.out.println("--- 2. exercise ---");
		secondExercise();
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private static List<Car> createCars()
	{
		Car car1 = new Car(1100);
		Car car2 = new Car(1256);
		Car car3 = new Car(526);
		Car car4 = new Car(920);
		
		return new ArrayList(Arrays.asList(car1, car2,car3,car4));
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private static List<MotorCycle> createCycles()
	{
		MotorCycle cycle1 = new MotorCycle(50);
		MotorCycle cycle2 = new MotorCycle(125);
		MotorCycle cycle3 = new MotorCycle(125);
		MotorCycle cycle4 = new MotorCycle(250);
		
		return new ArrayList(Arrays.asList(cycle1, cycle2,cycle3,cycle4));
	}
	
	private static void firstExercise()
	{
		List<Car> cars = createCars();
		
		VehicleRetriever<Car> vrWithCars = new VehicleRetriever<>();
		
		Car strongestCar = vrWithCars.getStrongestVehicle(cars);
		System.out.println("The strongest car is: " + strongestCar.toString());
		
		List<MotorCycle> cycles = createCycles();
		
		VehicleRetriever<MotorCycle> vrWithCycles = new VehicleRetriever<>();
		
		MotorCycle strongestCycle = vrWithCycles.getStrongestVehicle(cycles);
		System.out.println("The strongest motosCycle is: " + strongestCycle.toString());
	}
	
	private static void secondExercise()
	{
		List<Car> cars = createCars();
		List<MotorCycle> cycles = createCycles();
		
		VehicleRetriever<Car> vrWithCars = new VehicleRetriever<>();
		List<Car> sortedCars = vrWithCars.getSortedList(cars);
		for(Car car : sortedCars)
		{
			System.out.println(car.toString());
		}
		System.out.println(":::::::::::::::::::");
		VehicleRetriever<MotorCycle> vrWithCycles = new VehicleRetriever<>();
		List<MotorCycle> sortedCycles = vrWithCycles.getSortedList(cycles);
		for(MotorCycle cycle : sortedCycles)
		{
			System.out.println(cycle.toString());
		}
	}
	
}
