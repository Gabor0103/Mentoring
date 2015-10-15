package com.gabor.dogs;


public class Spaniel extends DogsSorting
{
	int mass;
	int speed;
	
	public int getMass()
	{
		return mass;
	}

	public void setMass(int mass)
	{
		this.mass = mass;
	}

	public int getSpeed()
	{
		return speed;
	}

	public void setSpeed(int speed)
	{
		this.speed = speed;
	}

	public Spaniel()
	{
		
	}
	
	public Spaniel(int mass, int speed)
	{
		this.mass = mass;
		this.speed = speed;
	}
}