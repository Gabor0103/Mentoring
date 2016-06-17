package com.gabor.main;

import com.gabor.domain.Vehicle;

public class PowerChecker<K extends Vehicle> implements IChecker<K>
{
	private int power;
	
	public PowerChecker(int power)
	{
		this.power = power;
	}
	
	@Override
	public boolean isTrue(K vehicle)
	{
		if(vehicle.getPower() >= power)
		{
			return true;
		}
		else
		{
			return false;
		}
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
