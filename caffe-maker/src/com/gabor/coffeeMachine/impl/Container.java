package com.gabor.coffeeMachine.impl;

import com.gabor.coffeeData.Portion;
import com.gabor.coffeeMachine.IContainer;
import com.gabor.coffeeMaker.exceptions.NotEnoughPortion;

public abstract class Container implements IContainer
{
	int currentVolume;
	int totalVolume;
	
//	@Override
//	public abstract boolean getPortion(Portion portion) throws NotEnoughPortion;

	public abstract int getDecPortion(Portion portion);
	
	@Override
	public boolean getPortion(Portion portion) throws NotEnoughPortion
	{
		if(totalVolume - getDecPortion(portion) > 0)
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
