package com.gabor.abstracts;


public abstract class AbstractDog implements Comparable<AbstractDog>
{	
	public int mass;
	public int speed;
	
	abstract public String bark();

	public String walk()
	{
		StringBuilder whatDoesTheDogSays = new StringBuilder();
		return whatDoesTheDogSays.append(bark()).toString();
	}
	
	public final String sniffing()
	{
		return "I like sniffing";
	}
	
	@Override
	public int compareTo(AbstractDog o)
	{
		// TODO Auto-generated method stub
		return 0;
	}
}
