package com.gabor.unitTests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.gabor.coffeeData.Portion;
import com.gabor.coffeeMachine.impl.WaterConatiner;
import com.gabor.coffeeMaker.exceptions.NotEnoughPortion;


public class WaterContainerUnitTests
{
	WaterConatiner waterContainer;
	
	@Rule
	public ExpectedException exception = ExpectedException.none();
	
	@Before
	public void setUp()
	{
		waterContainer = new WaterConatiner(4);
	}
	
	@Test
	public void testGetPortion() throws NotEnoughPortion
	{
		Assert.assertEquals(true, waterContainer.getPortion(Portion.SMALL));
	}
	
	@Test
	public void testGetPortionWithFailure() throws NotEnoughPortion
	{
		exception.expect(NotEnoughPortion.class);
		waterContainer.getPortion(Portion.LARGE);
	}
}
