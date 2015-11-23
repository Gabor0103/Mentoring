package com.gabor.dogs;

import java.util.Comparator;

import com.gabor.abstracts.AbstractDog;

//ABstractDog!
public class DogsSorting implements Comparator<AbstractDog>
{

	@Override
	public int compare(AbstractDog dog1, AbstractDog dog2)
	{
		return dog1.speed - dog2.speed;
	}
}
