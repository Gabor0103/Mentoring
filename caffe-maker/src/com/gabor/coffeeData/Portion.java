package com.gabor.coffeeData;

public enum Portion
{
	EMPTY(0),
	SMALL(1),
	MEDIUM(2),
	LARGE(5);
	
	private int portion;
	
	Portion(int portion)
	{
		this.portion = portion;
	}
	
	public int getSize()
	{
		return portion;
	}
	
}
