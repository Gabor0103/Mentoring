package com.gabor.mockitoUnitTest;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import com.gabor.coffeeData.Portion;
import com.gabor.coffeeMachine.impl.CoffeeConatiner;
import com.gabor.coffeeMachine.impl.CoffeeMachine;
import com.gabor.coffeeMachine.impl.WaterConatiner;
import com.gabor.coffeeMaker.exceptions.NotEnoughPortion;

public class CoffeeMachineMockitoUnitTests 
{
	@Test
	public void testMakeCoffeeWithMockito() throws NotEnoughPortion
	{
		//GIVEN  -  create mocks
		CoffeeConatiner mockedCoffeeContainerWithMockito = Mockito.mock(CoffeeConatiner.class);
		WaterConatiner mockedWaterContainerWithMockito = Mockito.mock(WaterConatiner.class);
		
		CoffeeMachine coffeMachineWithMockito = new CoffeeMachine(mockedWaterContainerWithMockito, mockedCoffeeContainerWithMockito);
		
		//WHEN  -  when = expect
//		Mockito.when(mockedCoffeeContainerWithMockito.getPortion(Portion.LARGE)).thenReturn(false);
//		Mockito.when(mockedWaterContainerWithMockito.getPortion(Portion.SMALL)).thenReturn(true);
//		Mockito.when(mockedCoffeeContainerWithMockito.getPortion(Portion.SMALL)).thenReturn(true);
		

		//tényleges hívás 
		boolean bool = coffeMachineWithMockito.makeCoffee(Portion.SMALL);
		
//		Mockito.verify(mockedCoffeeContainerWithMockito).getPortion(Portion.LARGE);
//		Mockito.verify(mockedWaterContainerWithMockito).getPortion(Portion.SMALL);
		
		//THEN
		Assert.assertTrue(bool);
	}
	
	@Test
	public void testMakeCoffeeWithFalseInMockito() throws NotEnoughPortion
	{
		//GIVEN
		CoffeeConatiner mockedCoffeeContainerWithMockito = Mockito.mock(CoffeeConatiner.class);
		WaterConatiner mockedWaterContainerWithMockito = Mockito.mock(WaterConatiner.class);
		
		CoffeeMachine coffeMachineWithMockito = new CoffeeMachine(mockedWaterContainerWithMockito, mockedCoffeeContainerWithMockito);
		
		//WHEN
		Mockito.when(mockedCoffeeContainerWithMockito.getPortion(Portion.LARGE)).thenReturn(true);
		Mockito.when(mockedWaterContainerWithMockito.getPortion(Portion.SMALL)).thenReturn(false);
		
		boolean bool = coffeMachineWithMockito.makeCoffee(Portion.LARGE);
		
		//THEN
		Assert.assertFalse(bool);
	}
	
	@Test
	public void testMakeCoffeeWithNotEnoughPortionException() throws NotEnoughPortion
	{
		//GIVEN
		CoffeeConatiner mockedCoffeeContainerWithMockito = Mockito.mock(CoffeeConatiner.class);
		WaterConatiner mockedWaterContainerWithMockito = Mockito.mock(WaterConatiner.class);
		
		CoffeeMachine coffeMachineWithMockito = new CoffeeMachine(mockedWaterContainerWithMockito, mockedCoffeeContainerWithMockito);
		
		//WHEN
		Mockito.when(mockedCoffeeContainerWithMockito.getPortion(Portion.LARGE)).thenReturn(true);
		Mockito.doThrow(new NotEnoughPortion()).when(mockedWaterContainerWithMockito).getPortion(Portion.LARGE);
		
		boolean bool = coffeMachineWithMockito.makeCoffee(Portion.LARGE);
		
		//THEN
		Assert.assertFalse(bool);
	}
}
