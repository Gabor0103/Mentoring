package com.gabor.coffeeMachine;

import com.gabor.coffeeData.Portion;
import com.gabor.coffeeMaker.exceptions.NotEnoughPortion;

public interface IContainer
{
	boolean getPortion(Portion portion) throws NotEnoughPortion;
	
	int getTotalVolume();
	
	int getCurrentVolume();
	
	void refillConatiner();
}
