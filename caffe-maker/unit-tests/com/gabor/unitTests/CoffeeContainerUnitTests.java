package com.gabor.unitTests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.gabor.coffeeData.Portion;
import com.gabor.coffeeMachine.impl.CoffeeConatiner;
import com.gabor.coffeeMaker.exceptions.NotEnoughPortion;

public class CoffeeContainerUnitTests
{
	CoffeeConatiner coffeeContainer;
	
	@Rule
	public ExpectedException exception = ExpectedException.none();
	
	@Before
	public void setUp()
	{
		coffeeContainer = new CoffeeConatiner(4);
	}
	
	@Test
	public void testGetPortion() throws NotEnoughPortion
	{
		Assert.assertEquals(true, coffeeContainer.getPortion(Portion.SMALL));
	}
	
	@Test
	public void testGetPortionWithFailure() throws NotEnoughPortion
	{
		exception.expect(NotEnoughPortion.class);
		coffeeContainer.getPortion(Portion.LARGE);
	}

}
