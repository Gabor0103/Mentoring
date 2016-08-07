package com.gabor.domain;

public class Car extends Vehicle {

	public Car(int power) {
		super(power);
	}
	
	public String toString() {
		return String.valueOf(power);
	}
}
