package com.gabor.domain;

public class MotorCycle extends Vehicle {
	
	public MotorCycle(int power) {
		super(power);
	}
	
	public String toString() {
		return String.valueOf(power);
	}
}
