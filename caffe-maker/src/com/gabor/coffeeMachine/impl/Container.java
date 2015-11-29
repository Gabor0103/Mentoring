package com.gabor.coffeeMachine.impl;

import com.gabor.coffeeData.Portion;
import com.gabor.coffeeMachine.IContainer;
import com.gabor.coffeeMaker.exceptions.NotEnoughPortion;

public class Container implements IContainer
{
	int currentVolume;
	int totalVolume;
	
	public Container(int volume)
	{
		currentVolume = volume;
		totalVolume = volume;
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

	@Override
	public int getTotalVolume()
	{
		return totalVolume;
	}

	@Override
	public int getCurrentVolume()
	{
		return currentVolume;
	}

	@Override
	public void refillConatiner()
	{
		
	}

}
