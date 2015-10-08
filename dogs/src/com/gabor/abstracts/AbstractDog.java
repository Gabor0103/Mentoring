package com.gabor.abstracts;

import com.gabor.interfaces.IDog;

public abstract class AbstractDog implements IDog
{	

	@Override
	public String walk()
	{
		StringBuilder whatDoesTheDogSays = new StringBuilder();
		for(int i = 0; i < 3; i++)
		{
			whatDoesTheDogSays.append(bark() + " " + i + ", ");
		}
		return whatDoesTheDogSays.toString();
	}

}
