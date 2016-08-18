package com.gabor.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import com.gabor.domain.Car;
import com.gabor.domain.MotorCycle;
import com.gabor.domain.Vehicle;
import com.gabor.impl.VehicleRetriever;

public class Main {

	public static void main(String[] args) {
		System.out.println("--- 1. exercise ---");
		firstExercise();
		System.out.println("--- 2. exercise ---");
		secondExercise();
		System.out.println("--- 3. exercise ---");
		List<Integer> numbers = new ArrayList<>();
		numbers.add(123);
		numbers.add(1234);
		numbers.add(12345);
		
		List<Vehicle> vehicles = new ArrayList<Vehicle>();
		List<Vehicle> vehicles2 = thirdExercise(numbers, vehicles);
		
		for(Vehicle v : vehicles2)
		{
			System.out.println("This is a " + v.getClass().getSimpleName() + " and it's power is: " + v.getPower());
		}
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
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private static List<Vehicle> createVehicle()
	{
		MotorCycle cycle1 = new MotorCycle(50);
		MotorCycle cycle2 = new MotorCycle(125);
		Car car1 = new Car(1100);
		Car car2 = new Car(1256);
		
		return new ArrayList(Arrays.asList(cycle1, cycle2, car1, car2));
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
		
		List<Vehicle> vehicles = createVehicle();		
		VehicleRetriever<Vehicle> vrWithVehicle = new VehicleRetriever<Vehicle>();		
		Vehicle strongestVehicle = vrWithVehicle.getStrongestVehicle(vehicles);
		System.out.println("The storngest Vehicle is: " + strongestVehicle.getPower() + 
				", and the type is: " + strongestVehicle.getClass().getSimpleName());
	}
	
	private static void secondExercise()
	{
		List<Car> cars = createCars();
		List<MotorCycle> cycles = createCycles();
		
		VehicleRetriever<Car> vrWithCars = new VehicleRetriever<>();
		List<Car> sortedCars = vrWithCars.getSortedList(cars);
		System.out.println("Sorted Car list: ");
		for(Car car : sortedCars)
		{
			System.out.println(car.toString());
		}
		
		VehicleRetriever<MotorCycle> vrWithCycles = new VehicleRetriever<>();
		List<MotorCycle> sortedCycles = vrWithCycles.getSortedList(cycles);
		System.out.println("Sorted Cycle list: ");
		for(MotorCycle cycle : sortedCycles)
		{
			System.out.println(cycle.toString());
		}
	}
	
	@SuppressWarnings("unchecked")
	private static List<Vehicle> thirdExercise(List<Integer> numbers, List<? super Vehicle> vehicles)
	{
		for(Integer power : numbers)
		{
			Random rand = new Random();
			int random = rand.nextInt(10) + 1;
			
			if(random % 2 == 0)
			{
				Car car = new Car(power);
				vehicles.add(car);
			}
			else
			{
				MotorCycle cycle = new MotorCycle(power);
				vehicles.add(cycle);
			}
		}
		return (List<Vehicle>) vehicles;
	}
	
//	Mi a különbség???
	
//	private static List<Vehicle> thirdExercise(List<Integer> numbers, List<Vehicle> vehicles)
//	{
//		for(Integer power : numbers)
//		{
//			Random rand = new Random();
//			int random = rand.nextInt(10) + 1;
//			
//			if(random % 2 == 0)
//			{
//				Car car = new Car(power);
//				vehicles.add(car);
//			}
//			else
//			{
//				MotorCycle cycle = new MotorCycle(power);
//				vehicles.add(cycle);
//			}
//		}
//		return vehicles;
//	}
	
}
