package com.gabor.coffeeMachine.impl;


import org.apache.log4j.Logger;

import com.gabor.coffeeData.Portion;
import com.gabor.coffeeMachine.ICoffeeMachine;
import com.gabor.coffeeMachine.IContainer;
import com.gabor.coffeeMaker.exceptions.NotEnoughPortion;

public class CoffeeMachine implements ICoffeeMachine
{
	final static Logger logger = Logger.getLogger(CoffeeMachine.class);
	
	IContainer waterContainer;
	IContainer coffeeContainer;
	
	public CoffeeMachine(IContainer waterContainer, IContainer coffeeContainer)
	{
		this.coffeeContainer = coffeeContainer;
		this.waterContainer = waterContainer;
	}
	
	@Override
	public boolean makeCoffee(Portion portion)
	{
		boolean isCoffeeEnough;
		boolean isWaterEnough;

		try
		{
			isCoffeeEnough = coffeeContainer.getPortion(portion);
			isWaterEnough = waterContainer.getPortion(portion);

		
			if(isCoffeeEnough && isWaterEnough)
			{
				return true;
			}
		}	
		catch(NotEnoughPortion exception)
		{
			logger.error("Sorry something wrong " + exception);
		}
	return false;
	}

//	@Override
//	public IContainer getCoffeeContainer()
//	{
//		return coffeeContainer;
//	}
//
//	@Override
//	public IContainer getWaterContainer()
//	{
//		return waterContainer;
//	}

}
