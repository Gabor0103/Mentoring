package com.gabor.domain;

import java.util.Collection;

import com.gabor.main.IChecker;
import com.gabor.main.IVehicle;

public class Vehicle implements IVehicle {

	protected Vehicle(String color, int power)
	{
		this.color=color;
		this.power=power;
	}
	
	private String color;
	private int power;
	
	public int getPower()
	{
		return power;
	}

	public void setPower(int power)
	{
		this.power = power;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public <K extends Vehicle, Z extends Collection<K>> int numberOfCarsBasicOfColor(Z vehicles, IChecker<K> colorChecker) {
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
