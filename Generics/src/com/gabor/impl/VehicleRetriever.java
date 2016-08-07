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
	public List<L> getSortedList(List<L> vehicles)
	{
		Collections.sort(vehicles, new Comparator<L>() {

			@Override
			public int compare(L vehicle1, L vehicle2) {
				return vehicle1.getPower() < vehicle2.getPower() ? -1 : (vehicle1.getPower() > vehicle2.getPower()) ? 1 : 0;
			}
		});
		
		return vehicles;
	}
	// ---------------------------------------------
}
