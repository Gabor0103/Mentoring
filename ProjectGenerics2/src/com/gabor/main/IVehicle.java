package com.gabor.main;

import java.util.Collection;

import com.gabor.domain.Vehicle;

public interface IVehicle {

	public <K extends Vehicle, Z extends Collection<K>> int numberOfCarsBasicOfColor(Z vehicles, IChecker<K> colorChecker);
	
}
