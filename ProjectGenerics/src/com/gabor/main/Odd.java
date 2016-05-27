package com.gabor.main;

public class Odd<T extends Number> implements ICheck<T>
{

	@Override
	public boolean isTrue(T number)
	{
		return number.intValue() % 2 != 0;
	}

}
