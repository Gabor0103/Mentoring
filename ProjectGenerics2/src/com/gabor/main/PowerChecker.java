package com.gabor.main;

import com.gabor.domain.Vehicle;

public class PowerChecker<K extends Vehicle> implements IChecker<K>
{

	@Override
	public int powerChecker(K vehicle)
	{
		return 0;
	}

	@Override
	public String colorChecker(String color)
	{
		// Do nothing
		return "";
	}

}
