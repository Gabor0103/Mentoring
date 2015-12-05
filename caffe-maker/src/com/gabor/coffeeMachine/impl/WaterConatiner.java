package com.gabor.coffeeMachine.impl;

import com.gabor.coffeeData.Portion;
import com.gabor.coffeeMaker.exceptions.NotEnoughPortion;


public class WaterConatiner extends Container
{
	public WaterConatiner(int volume)
	{
		super.totalVolume = volume;
	}
	
	@Override
	public boolean getPortion(Portion portion) throws NotEnoughPortion
	{	
		if(super.getTotalVolume() - portion.getSize() + 1 > 0)
		{
			return true;
		}
		else
		{
			throw new NotEnoughPortion();
		}
	}

}
