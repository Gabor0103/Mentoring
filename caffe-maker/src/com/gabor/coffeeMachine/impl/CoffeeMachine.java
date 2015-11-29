package com.gabor.coffeeMachine.impl;


import com.gabor.coffeeData.Portion;
import com.gabor.coffeeMachine.ICoffeeMachine;
import com.gabor.coffeeMachine.IContainer;
import com.gabor.coffeeMaker.exceptions.NotEnoughPortion;

public class CoffeeMachine implements ICoffeeMachine
{
	IContainer waterContainer;
	IContainer coffeeContainer;
	
	public CoffeeMachine(IContainer waterContainer, IContainer coffeeContainer)
	{
		this.coffeeContainer = coffeeContainer;
		this.waterContainer = waterContainer;
	}
	
	@Override
	public boolean makeCoffee(Portion portion) throws NotEnoughPortion
	{
		boolean isCoffeeEnough;
		boolean isWaterEnough;

		isCoffeeEnough = coffeeContainer.getPortion(portion);
		isWaterEnough = waterContainer.getPortion(portion);

		
		if(isCoffeeEnough && isWaterEnough)
		{
			return true;
		}
		else
		{
			return false;
		}
		
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
