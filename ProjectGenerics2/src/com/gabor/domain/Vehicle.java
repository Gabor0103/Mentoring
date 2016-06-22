package com.gabor.domain;

import com.gabor.main.IVehicle;
//a comperablenek miért kell megadni tipus parametert ha úgy is az adott osztályra vonatkozik??
public class Vehicle implements IVehicle, Comparable<Integer>{

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
	public int compareTo(Integer i) {
		if(this.power > i)
		{
			return -1;
		}
		else if(this.power == 0)
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}


	
//	@Override
//	public <K extends Vehicle, Z extends Collection<K>> int numberOfCarsBasicOfColor(Z vehicles, IChecker<K> colorChecker) {
//		int number = 0;
//		
//		for(K vehicle : vehicles)
//		{
//			if(vehicle.getColor().equals(color))
//			{
//				number++;
//			}
//		}
//		
//		return number;
//	}

		
}
