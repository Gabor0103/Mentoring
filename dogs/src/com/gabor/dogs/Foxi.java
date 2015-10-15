package com.gabor.dogs;

import com.gabor.abstracts.AbstractDog;

public class Foxi extends AbstractDog
{
//	 private int mass;
//	 private int speed;

	public Foxi(int mass, int speed)
	{
		this.mass = mass;
		this.speed = speed;
	}

//	Itt módosítani lehetne a rendezésen!
//	@Override
//	public int compareTo(AbstractDog dog)
//	{
//		return dog.mass - this.mass;
//	}

	@Override
	public String bark()
	{
		return "I am a Foxi";
	}

}
