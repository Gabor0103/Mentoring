package com.gabor.dogs;

import java.util.HashMap;
import java.util.Map;

import com.gabor.abstracts.AbstractDog;

public final class NemetJuhasz extends AbstractDog //Mivel final nem lehet származtatni belõle
{

	final static int legs = 4; //Mikor példányosítjuk akkor jön létre egyszer a memóriában
	int barkVolume;
	int speed;
	
	//final static map
	private static final Map<Integer, String> myMap;
		static
		{
			myMap = new HashMap<Integer, String>();
			myMap.put(1, "January");
		};
	
	public NemetJuhasz(int barkVolume, int speed)
	{
		super(0, speed);
		this.barkVolume = barkVolume;
//		this.speed = speed;
	}
	
	public final static void run() // mivel final nem lehet Override-olni
	{
		//speed = 20; hiba a speednek staticnak kell lennie.
		System.out.println("I am running with: ");
	}
	
	@Override
	public String bark()
	{
		return "I am a nemetjuhasz. My volume is: " + Integer.toString(barkVolume) + ". My speed is: " 
					+ Integer.toString(speed)
					+ ", and I have " + Integer.toString(legs) + " legs.";
	}	
}