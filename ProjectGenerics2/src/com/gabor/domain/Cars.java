package com.gabor.domain;

public class Cars extends Vehicle {

	public Cars(String color, int power)
	{
		super(color, power);
	}	
	
	@Override
	public String toString()
	{
		return super.toString() + ": car";
	}
}
