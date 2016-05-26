package com.gabor.unitTests;

import org.easymock.EasyMock;
import org.mockito.InOrder;
import org.mockito.Mockito;
import org.easymock.IMocksControl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.gabor.coffeeData.Portion;
import com.gabor.coffeeMachine.ICoffeeMachine;
import com.gabor.coffeeMachine.impl.CoffeeConatiner;
import com.gabor.coffeeMachine.impl.CoffeeMachine;
import com.gabor.coffeeMachine.impl.WaterConatiner;
import com.gabor.coffeeMaker.exceptions.NotEnoughPortion;

public class CoffeeMachineUnitTests
{

	ICoffeeMachine coffeeMachine;
	WaterConatiner mockedWaterContainer;
	CoffeeConatiner mockedCoffeeContainer;
	IMocksControl mock;
	
	@Before
	public void setUp()
	{
		mock = EasyMock.createStrictControl();
		
		mockedCoffeeContainer = mock.createMock(CoffeeConatiner.class);
		mockedWaterContainer = mock.createMock(WaterConatiner.class);
		
		coffeeMachine = new CoffeeMachine(mockedWaterContainer, mockedCoffeeContainer);
	}
	
	@Test
	public void testMakeCoffee() throws NotEnoughPortion
	{
		EasyMock.expect(mockedCoffeeContainer.getPortion(Portion.SMALL)).andReturn(true);
		EasyMock.expect(mockedWaterContainer.getPortion(Portion.SMALL)).andReturn(true);

		mock.replay();
				
		Assert.assertEquals(true, coffeeMachine.makeCoffee(Portion.SMALL));
		
		mock.verify();
	}
	
	@Test
	public void testMakeCoffeeWithFalse() throws NotEnoughPortion
	{
		EasyMock.expect(mockedCoffeeContainer.getPortion(Portion.LARGE)).andReturn(true);
		EasyMock.expect(mockedWaterContainer.getPortion(Portion.LARGE)).andReturn(false);
		
		mock.replay();
		
		Assert.assertEquals(false, coffeeMachine.makeCoffee(Portion.LARGE));
		
		mock.verify();
	}
	
	@Test
	public void testMakeCoffeeWithNotEnoughPortionException() throws NotEnoughPortion
	{
		EasyMock.expect(mockedCoffeeContainer.getPortion(Portion.LARGE)).andReturn(true);
		EasyMock.expect(mockedWaterContainer.getPortion(Portion.LARGE)).andThrow(new NotEnoughPortion());
		
		mock.replay();

		Assert.assertEquals(false, coffeeMachine.makeCoffee(Portion.LARGE));

		mock.verify();
	}
	
	@Test
	public void testMakeCoffeeWhenThirdCallThrowException() throws NotEnoughPortion
	{
		EasyMock.expect(mockedCoffeeContainer.getPortion(Portion.SMALL)).andReturn(true);
		EasyMock.expect(mockedWaterContainer.getPortion(Portion.SMALL)).andReturn(true);
		EasyMock.expect(mockedCoffeeContainer.getPortion(Portion.SMALL)).andReturn(true);
		EasyMock.expect(mockedWaterContainer.getPortion(Portion.SMALL)).andReturn(true);
		EasyMock.expect(mockedCoffeeContainer.getPortion(Portion.SMALL)).andReturn(true);
		EasyMock.expect(mockedWaterContainer.getPortion(Portion.SMALL)).andThrow(new NotEnoughPortion());
		
		mock.replay();
				
		Assert.assertEquals(true, coffeeMachine.makeCoffee(Portion.SMALL));
		Assert.assertEquals(true, coffeeMachine.makeCoffee(Portion.SMALL));
		
		//exception.expect(NotEnoughPortion.class);
		Assert.assertEquals(false, coffeeMachine.makeCoffee(Portion.SMALL));
		
		mock.verify();
	}
}
