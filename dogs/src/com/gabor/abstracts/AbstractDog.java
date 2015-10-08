package com.gabor.abstracts;


public abstract class AbstractDog
{	
	abstract public String bark();

	public String walk()
	{
		StringBuilder whatDoesTheDogSays = new StringBuilder();
		for(int i = 0; i < 3; i++)
		{
			whatDoesTheDogSays.append(bark() + " " + i + ", ");
		}
		return whatDoesTheDogSays.toString();
	}
	
	public final String sniffing()
	{
		return "I like sniffing";
	}

}
