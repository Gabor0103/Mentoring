package com.gabor.main;

import com.gabor.dogs.MagyarVizsla;
import com.gabor.dogs.NemetJuhasz;
import com.gabor.dogs.Puli;
import com.gabor.person.Person;

public class Walk
{

	public static void main(String[] args)
	{
//		Puli puli = new Puli();
//		MagyarVizsla vizsla = new MagyarVizsla();
		Person person = new Person();
//		person.walkWithDog(puli);
//		person.walkWithDog(vizsla);
		
		NemetJuhasz nemetjuhasz = new NemetJuhasz(4, 20);
		person.walkWithDog(nemetjuhasz);
	}

}
