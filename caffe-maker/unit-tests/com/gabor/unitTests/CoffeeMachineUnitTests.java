package com.gabor.unitTests;

import static org.junit.Assert.fail;

import org.easymock.EasyMock;
import org.easymock.IMocksControl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.gabor.coffeeData.Portion;
import com.gabor.coffeeMachine.ICoffeeMachine;
import com.gabor.coffeeMachine.IContainer;
import com.gabor.coffeeMachine.impl.CoffeeMachine;
import com.gabor.coffeeMaker.exceptions.NotEnoughPortion;

public class CoffeeMachineUnitTests
{

	ICoffeeMachine coffeeMachine;
	IContainer waterContainer;
	IContainer coffeeContainer;
	IMocksControl mock;
	
	
	@Before
	public void setUp()
	{
		mock = EasyMock.createStrictControl();
		
		coffeeContainer = mock.createMock(IContainer.class);
		waterContainer = mock.createMock(IContainer.class);
		
		coffeeMachine = new CoffeeMachine(waterContainer, coffeeContainer);
	}
	
	@Test
	public void testMakeCoffee() throws NotEnoughPortion
	{
		EasyMock.expect(coffeeContainer.getPortion(Portion.LARGE)).andReturn(true);
		EasyMock.expect(waterContainer.getPortion(Portion.LARGE)).andReturn(true);
		
		mock.replay();
		
		Assert.assertEquals(true, coffeeMachine.makeCoffee(Portion.LARGE));
		
		mock.verify();
	}
	
	@Test
	public void testMakeCoffeeWithFalse() throws NotEnoughPortion
	{
		EasyMock.expect(coffeeContainer.getPortion(Portion.LARGE)).andReturn(true);
		EasyMock.expect(waterContainer.getPortion(Portion.LARGE)).andReturn(false);
		
		mock.replay();
		
		Assert.assertEquals(false, coffeeMachine.makeCoffee(Portion.LARGE));
		
		mock.verify();
	}
	
	@Test
	public void testMakeCoffeeWithNotEnoughPortionException() throws NotEnoughPortion
	{
		EasyMock.expect(coffeeContainer.getPortion(Portion.LARGE)).andReturn(true);
		EasyMock.expect(waterContainer.getPortion(Portion.LARGE)).andThrow(new NotEnoughPortion());
		
		mock.replay();
		try
		{
			coffeeMachine.makeCoffee(Portion.LARGE);
			fail("Should be thrown NotEnoughPortion exception");
		}
		catch(NotEnoughPortion e)
		{
			//expected
		}
		mock.verify();
	}
}
