package com.gabor.dogs;

import com.gabor.abstracts.AbstractDog;

public class MagyarVizsla extends AbstractDog
{

	@Override
	public String bark()
	{
		return "I am a vizsla";
	}
	
//	Hiba hogy töröljem a final kulcsszót
//	public String sniffing()
//	{
//		return "I am rushing";
//	}
}
