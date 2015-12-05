package com.gabor.coffeeMachine.impl;

import com.gabor.coffeeData.Portion;
import com.gabor.coffeeMaker.exceptions.NotEnoughPortion;


public class WaterConatiner extends Container
{
	int currentVolume;
	int totalVolume;
	
	public WaterConatiner(int volume)
	{
		currentVolume = volume;
	}
	
	@Override
	public boolean getPortion(Portion portion) throws NotEnoughPortion
	{
		if(currentVolume - portion.getSize() + 1 > 0)
		{
			return true;
		}
		else
		{
			throw new NotEnoughPortion();
		}
	}

}
