package com.gabor.coffeeMachine;

import com.gabor.coffeeData.Portion;
import com.gabor.coffeeMaker.exceptions.NotEnoughPortion;

public interface ICoffeeMachine
{
	 boolean makeCoffee(Portion portion) throws NotEnoughPortion;
	 
//	 IContainer getCoffeeContainer();
//	 
//	 IContainer getWaterContainer();
}
