package com.gabor.unitTests;

import static org.junit.Assert.fail;
import static org.easymock.EasyMock.replay;
import static org.easymock.EasyMock.verify;

import org.easymock.EasyMock;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.gabor.coffeeData.Portion;
import com.gabor.coffeeMachine.ICoffeeMachine;
import com.gabor.coffeeMachine.IContainer;
import com.gabor.coffeeMachine.impl.CoffeeConatiner;
import com.gabor.coffeeMachine.impl.CoffeeMachine;
import com.gabor.coffeeMachine.impl.WaterConatiner;
import com.gabor.coffeeMaker.exceptions.NotEnoughPortion;

public class CoffeeMachineUnitTests
{

	ICoffeeMachine coffeeMachine;
	IContainer waterContainer;
	IContainer coffeeContainer;
	
	
	@Before
	public void setUp()
	{
		coffeeContainer = EasyMock.createMock(CoffeeConatiner.class);
		waterContainer = EasyMock.createMock(WaterConatiner.class);
		
		coffeeMachine = new CoffeeMachine(waterContainer, coffeeContainer);
	}
	
	@Test
	public void testMakeCoffee() throws NotEnoughPortion
	{
		EasyMock.expect(coffeeContainer.getPortion(Portion.LARGE)).andReturn(true);
		EasyMock.expect(waterContainer.getPortion(Portion.LARGE)).andReturn(true);
		
		replay(waterContainer, coffeeContainer);
		
		Assert.assertEquals(true, coffeeMachine.makeCoffee(Portion.LARGE));
		
		verify(waterContainer, coffeeContainer);
	}
	
	@Test
	public void testMakeCoffeeWithFalse() throws NotEnoughPortion
	{
		EasyMock.expect(coffeeContainer.getPortion(Portion.LARGE)).andReturn(true);
		EasyMock.expect(waterContainer.getPortion(Portion.LARGE)).andReturn(false);
		
		replay(waterContainer, coffeeContainer);
		
		Assert.assertEquals(false, coffeeMachine.makeCoffee(Portion.LARGE));
		
		verify(waterContainer, coffeeContainer);
	}
	
	@Test
	public void testMakeCoffeeWithNotEnoughPortionException() throws NotEnoughPortion
	{
		EasyMock.expect(coffeeContainer.getPortion(Portion.LARGE)).andReturn(true);
		EasyMock.expect(waterContainer.getPortion(Portion.LARGE)).andThrow(new NotEnoughPortion());
		
		replay(waterContainer, coffeeContainer);
		try
		{
			coffeeMachine.makeCoffee(Portion.LARGE);
			fail("Should be thrown NotEnoughPortion exception");
		}
		catch(NotEnoughPortion e)
		{
			//expected
		}
		verify(waterContainer, coffeeContainer);
	}

}
