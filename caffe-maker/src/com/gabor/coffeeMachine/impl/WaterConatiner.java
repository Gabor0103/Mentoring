package com.gabor.coffeeMachine.impl;

import com.gabor.coffeeData.Portion;


public class WaterConatiner extends Container
{
	public WaterConatiner(int volume)
	{
		super.totalVolume = volume;
	}
	
	@Override
	public int getDecPortion(Portion portion)
	{
		return portion.getSize() + 1;
	}

}
