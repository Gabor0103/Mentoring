package com.gabor.main;

public class Even<K extends Number> implements ICheck<K>
{

	@Override
	public boolean isTrue(K number)
	{
		return number.intValue() % 2 == 0;
	}

}
