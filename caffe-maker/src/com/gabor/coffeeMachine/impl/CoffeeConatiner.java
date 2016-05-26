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
	public int getDecPortion(Portion portion) {
		// TODO Auto-generated method stub
		return portion.getSize();
	}
}
