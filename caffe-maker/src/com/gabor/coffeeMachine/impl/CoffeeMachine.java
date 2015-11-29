package com.gabor.coffeeMachine.impl;


import com.gabor.coffeeData.Portion;
import com.gabor.coffeeMachine.ICoffeeMachine;
import com.gabor.coffeeMachine.IContainer;
import com.gabor.coffeeMaker.exceptions.NotEnoughPortion;

public class CoffeeMachine implements ICoffeeMachine
{

	IContainer waterContainer;
	
	IContainer coffeeContainer;
	
	@Override
	public boolean makeCoffee(Portion portion) throws NotEnoughPortion
	{
		if(!coffeeContainer.getPortion(portion) && !waterContainer.getPortion(portion))
		{
			throw new NotEnoughPortion();
		}
		else
		{
			
		}
		return true;
	}

	@Override
	public IContainer getCoffeeContainer()
	{
		return coffeeContainer;
	}

	@Override
	public IContainer getWaterContainer()
	{
		return waterContainer;
	}

}
