package com.gabor.main;

import java.util.List;

import com.gabor.domain.Vehicle;

public interface IVehicle {

	public <T extends Vehicle> int numberOfCarsBasicOfColor(List<T> vehicles, String color);
	
}
