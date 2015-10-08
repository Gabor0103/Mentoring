package com.gabor.dogs;

import com.gabor.abstracts.AbstractDog;

public final class NemetJuhasz extends AbstractDog//Mivel final nem lehet származtatni belõle
{

	final static int legs = 4; //Mikor példányosítjuk akkor jön létre egyszer a memóriában
	int barkVolume;
	int speed;
	
	public NemetJuhasz(int barkVolume, int speed)
	{
		this.barkVolume = barkVolume;
		this.speed = speed;
	}
	
	public final static void run()
	{
		//speed = 20; hiba a speednek staticnak kell lennie.
		System.out.println("I am running with: ");
	}
	
	@Override
	public String bark()
	{
		return "I am a nemetjuhasz. My volume is: " + Integer.toString(barkVolume) + ". My speed is: " 
					+ Integer.toString(speed)
					+ ", and I have " + Integer.toString(legs) + "legs.";
	}	
}
