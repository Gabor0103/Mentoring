package com.gabor.coffeeData;

public enum Portion
{
	SMALL(1),
	MEDIUM(2),
	LARGE(5);
	
	private int portion;
	
	Portion(int portion)
	{
		this.portion = portion;
	}
	
	public int getID()
	{
		return portion;
	}
	
}
