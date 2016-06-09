package com.gabor.main;

import com.gabor.domain.Vehicle;

public interface IChecker<K extends Vehicle>
{
	public int powerChecker(K vehicle);
	public String colorChecker(String color);
}
