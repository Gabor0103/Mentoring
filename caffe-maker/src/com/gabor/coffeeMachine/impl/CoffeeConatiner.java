package com.gabor.coffeeMachine.impl;

import com.gabor.coffeeData.Portion;
import com.gabor.coffeeMaker.exceptions.NotEnoughPortion;

public class CoffeeConatiner extends Container
{

	public CoffeeConatiner(int volume)
	{
		totalVolume = volume;
	}
	
	@Override
	public boolean getPortion(Portion portion) throws NotEnoughPortion
	{
		if(totalVolume - portion.getSize() > 0)
		{
			return true;
		}
		else
		{
			throw new NotEnoughPortion();
		}
	}
}
