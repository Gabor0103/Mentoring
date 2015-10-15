package com.gabor.dogs;

import java.util.Comparator;

public class DogsSorting implements Comparator<Spaniel>
{

	@Override
	public int compare(Spaniel dog1, Spaniel dog2)
	{
		return dog1.speed - dog2.speed;
	}
}
