package com.gabor.unitTests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.gabor.coffeeData.Portion;
import com.gabor.coffeeMachine.IContainer;
import com.gabor.coffeeMachine.impl.Container;
import com.gabor.coffeeMaker.exceptions.NotEnoughPortion;


public class ContainerUnitTests
{
	IContainer container;
	
	@Rule
	public ExpectedException exception = ExpectedException.none();
	
	@Before
	public void setUp()
	{
		container = new Container(4);
	}
	
	@Test
	public void testGetPortion() throws NotEnoughPortion
	{
		Assert.assertEquals(true, container.getPortion(Portion.SMALL));
	}
	
	@Test
	public void testGetPortionWithFailure() throws NotEnoughPortion
	{
		exception.expect(NotEnoughPortion.class);
		container.getPortion(Portion.LARGE);
	}
}
