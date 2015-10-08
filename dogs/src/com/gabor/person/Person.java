package com.gabor.person;

import com.gabor.abstracts.AbstractDog;

public class Person
{

	public void walkWithDog(AbstractDog dog)
	{
		System.out.println("My dog is saying: " + dog.walk());
	}
}
