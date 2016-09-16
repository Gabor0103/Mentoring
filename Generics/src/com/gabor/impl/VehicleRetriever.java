package com.gabor.impl;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.gabor.domain.Vehicle;

public class VehicleRetriever<L extends Vehicle> {

	// --------- 1 feladat megoldása!!!! ------------
	public L getStrongestVehicle(List<L> vehicles)
	{
		Collections.sort(vehicles, new VehicleComperator<L>());
		
		 return vehicles.get(0);
	}
	// ---------------------------------------------

	// ---------- 2 feladat megoldása --------------
	public static void getSortedList(List<? extends Vehicle> vehicles)
	{
//		Collections.sort(vehicles, new Comparator<Vehicle>() {
//			@Override
//			public int compare(Vehicle vehicle1, Vehicle vehicle2) {
//				return vehicle1.getPower() < vehicle2.getPower() ? -1 : (vehicle1.getPower() > vehicle2.getPower()) ? 1 : 0;
//			}
//		});
		
		Collections.sort(vehicles, (v1, v2) -> v1.getPower() < v2.getPower() ? -1 : (v1.getPower() > v2.getPower()) ? 1 : 0);
		
		for(Vehicle v : vehicles)
		{
			System.out.println(v.getPower() + "*****");
		}
	}
	// ---------------------------------------------
}
