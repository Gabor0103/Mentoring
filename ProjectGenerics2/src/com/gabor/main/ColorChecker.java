package com.gabor.main;

import com.gabor.domain.Vehicle;

public class ColorChecker<K extends Vehicle> implements IChecker<K>
{

	@Override
	public int powerChecker(K vehicle)
	{
		// Do nothing
		return 0;
	}

	@Override
	public String colorChecker(String color)
	{
		return color;
	}

}
