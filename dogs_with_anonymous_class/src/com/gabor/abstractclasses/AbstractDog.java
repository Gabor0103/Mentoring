package com.gabor.abstractclasses;

import com.gabor.interfaces.IDog;
//Ha nem abstarct az osztály hibát jelez hogy unimplemented method. Miért?
public abstract class AbstractDog implements IDog
{
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
