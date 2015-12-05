package com.gabor.coffeeMachine.impl;

import com.gabor.coffeeData.Portion;
import com.gabor.coffeeMaker.exceptions.NotEnoughPortion;

public class CoffeeConatiner extends Container
{
	int currentVolume;
	int totalVolume;

	public CoffeeConatiner(int volume)
	{
		currentVolume = volume;
	}
	
	@Override
	public boolean getPortion(Portion portion) throws NotEnoughPortion
	{
		if(currentVolume - portion.getSize() > 0)
		{
			return true;
		}
		else
		{
			throw new NotEnoughPortion();
		}
	}
}
