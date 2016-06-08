package com.gabor.domain;

import java.util.List;

import com.gabor.main.IVehicle;

public class Vehicle implements IVehicle {

	protected String color;
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public <K extends Vehicle> int numberOfCarsBasicOfColor(List<K> vehicles, String color) {
		int number = 0;
		
		for(K vehicle : vehicles)
		{
			if(vehicle.getColor().equals(color))
			{
				number++;
			}
		}
		
		return number;
	}

		
}
