package com.gabor.coffeeMaker.exceptions;

public class NotEnoughPortion extends Exception
{
	private static final long	serialVersionUID	= -6059677072540875442L;
	private static final String message = "Not enough!";
	
	
	public NotEnoughPortion()
	{
		super(message);
	}
	
}
