package com.gabor.coffeeMachine.impl;

import com.gabor.coffeeData.Portion;
import com.gabor.coffeeMachine.IContainer;
import com.gabor.coffeeMaker.exceptions.NotEnoughPortion;

public class WaterConatiner implements IContainer
{
	
	@Override
	public boolean getPortion(Portion portion) throws NotEnoughPortion
	{
		return false;
	}

	@Override
	public int getTotalVolume()
	{
		return 0;
	}

	@Override
	public int getCurrentVolume()
	{
		return 0;
	}

	@Override
	public void refillConatiner()
	{
		
	}
}
