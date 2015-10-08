package com.gabor.dogs;

import com.gabor.abstractclasses.AbstractDog;


public class DogsInAnonymClass
{
	public static class Puli extends AbstractDog
	{
		public String bark()
		{
			return "I am a static Puli";
		}
	}
	
	public class Kuvasz extends AbstractDog
	{
		public String bark()
		{
			return "I am a kuvasz";
		}
	}
	
	public void goWalk()
	{
		AbstractDog puli = new AbstractDog()
		{
			public String bark()
			{
				return "I am a puli";
			}
		};
		
		AbstractDog magyarVizsla = new AbstractDog()
		{
			public String bark()
			{
				return "I am a vizsla";
			}
		};
		
		Kuvasz kuvasz = new Kuvasz();
		System.out.println(kuvasz.walk());
		System.out.println(puli.walk());
		System.out.println(magyarVizsla.walk());
	}
	
}
