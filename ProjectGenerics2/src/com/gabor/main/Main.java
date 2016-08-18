
package com.gabor.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.gabor.domain.Cars;
import com.gabor.domain.Motorcycle;
import com.gabor.domain.Vehicle;

public class Main
{

	public static <K extends Vehicle> void main(String[] args)
	{

		List<K> vehicles = createVehicle();

		ColorChecker<K> colorChecker = new ColorChecker<K>("red");
		PowerChecker<K> powerChecker = new PowerChecker<K>(51);

		int number = typeOfNumber(vehicles, colorChecker);
		int numberOfPower = typeOfNumber(vehicles, powerChecker);
		int numberOfPowerWithComperable = typeOfNumber(vehicles);

		System.out.println("Number of red: " + number);
		System.out.println("Number of the vehicles which the power is grater than 50: " + numberOfPower);
		System.out.println("Number of the vehicles which the power is grater than 50 with comperable: " + numberOfPowerWithComperable);

		List<Cars> carlist = new ArrayList<>();
		List<Motorcycle> mlist = new ArrayList<>();
		Cars cr = new Cars(null, 0);
//		get(cr);
		// sort(carlist);
//		sort2(carlist);
//		sort2(mlist);

		Main.<Cars> get2(cr);
	}

	public static <L extends Vehicle> Integer typeOfNumber(List<L> collection, IChecker<L> checker)
	{
		int i = 0;
		for (L vehicle : collection)
		{
			if (checker.isTrue(vehicle))
			{
				i++;
			}
		}
		return i;
	}

	public static <L extends Vehicle> int typeOfNumber(List<L> collection)
	{
		int i = 0;
		for (L vehicle : collection)
		{
			if (vehicle.compareTo(1234) == -1)
			{
				i++;
			}
		}
		return i;
	}

	private static <K extends Vehicle> List<K> createVehicle()
	{
		Cars car1 = new Cars("red", 1100);
		Cars car2 = new Cars("blue", 1256);
		Cars car3 = new Cars("green", 526);
		Cars car4 = new Cars("red", 920);
		Motorcycle cycle1 = new Motorcycle("green", 1125);
		Motorcycle cycle2 = new Motorcycle("green", 1235);
		Motorcycle cycle3 = new Motorcycle("red", 255);
		Motorcycle cycle4 = new Motorcycle("red", 50);
		
		List<? super Vehicle> foo3 = new ArrayList<>();
		foo3.add(car1);
		
		
		List<Vehicle> addVehicle = new ArrayList<Vehicle>();
		addVehicle.add(car1);
		addVehicle.add(cycle1);
		
		for (Vehicle v : addVehicle)
		{
			System.out.println(v.toString());
		}
		
		// rawtype??
		// https://docs.oracle.com/javase/tutorial/java/generics/rawTypes.html
		return new ArrayList(Arrays.asList(car1, car2, car3, car4, cycle1, cycle2, cycle3, cycle4));
	}

	public static <T> T get2(T v)
	{
		return v;
	}
}
