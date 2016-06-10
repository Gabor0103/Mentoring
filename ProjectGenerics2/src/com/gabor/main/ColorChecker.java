package com.gabor.main;

import com.gabor.domain.Vehicle;

public class ColorChecker<K extends Vehicle> implements IChecker<K>
{
	private String color;
	
	public ColorChecker(String color)
	{
		this.color=color;
	}
	
	@Override
	public boolean isTrue(K vehicle)
	{
		return vehicle.getColor().equals(color);
	}

//	@Override
//	public int powerChecker(K vehicle)
//	{
//		// Do nothing
//		return 0;
//	}
//
//	@Override
//	public String colorChecker(String color)
//	{
//		return color;
//	}

}
