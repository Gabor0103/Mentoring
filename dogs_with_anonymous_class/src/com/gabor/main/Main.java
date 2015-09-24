package com.gabor.main;

import com.gabor.dogs.DogsInAnonymClass;

public class Main
{

	public static void main(String[] args)
	{
		DogsInAnonymClass dog = new DogsInAnonymClass();
		dog.goWalk();
		
		System.out.println("Kuvasz as inner class: ");
		DogsInAnonymClass.Kuvasz kuvasz = dog.new Kuvasz();
		System.out.println(kuvasz.walk());
	}

}
