package com.gabor.dogs;

import com.gabor.abstracts.AbstractDog;

public class Puli extends AbstractDog
{

	public Puli(int speed, int mass)
	{
		super(speed, mass);
	}

	@Override
	public String bark()
	{
		return "I am a puli";
	}
}
