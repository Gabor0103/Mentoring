package com.gabor.abstractclasses;

import com.gabor.interfaces.IDog;
//Ha nem abstarct az oszt�ly hib�t jelez hogy unimplemented method. Mi�rt?
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
