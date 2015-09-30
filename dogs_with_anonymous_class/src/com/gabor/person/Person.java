package com.gabor.person;

import com.gabor.interfaces.IDog;

public class Person
{
	public void walkWithDog(IDog dog)
	{
		System.out.println("My dog is saying: " + dog.walk());
	}
}
