package com.gabor.dogs;

import com.gabor.abstracts.AbstractDog;
import com.gabor.interfaces.IDog;

public class Puli extends AbstractDog implements IDog
{

	@Override
	public String bark()
	{
		return "I am a puli";
	}
}
