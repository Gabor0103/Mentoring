package com.gabor.impl;

import java.util.Comparator;

import com.gabor.domain.Vehicle;

public class VehicleComperator<T extends Vehicle> implements Comparator<T> {

	@Override
	public int compare(T vehicle1, T vehicle2) {
		return vehicle1.getPower() < vehicle2.getPower() ? 1 : (vehicle1.getPower() > vehicle2.getPower()) ? -1 : 0;
	}
	
//	@Override
//	public int compare(T vehicle1, T vehicle2) {
//		Integer i = vehicle1.getPower();
//		Integer i2 = vehicle2.getPower();
//		return i.compareTo(i2);
//	}

}
