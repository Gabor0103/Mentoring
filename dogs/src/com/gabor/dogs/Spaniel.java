package com.gabor.dogs;

import com.gabor.abstracts.AbstractDog;


public class Spaniel extends AbstractDog
{
//	int mass;
//	int speed;
	
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
	
	public Spaniel(int mass, int speed)
	{
		super(speed, mass);
//		this.mass = mass;
//		this.speed = speed;
	}

	@Override
	public String bark()
	{
		// TODO Auto-generated method stub
		return null;
	}
}