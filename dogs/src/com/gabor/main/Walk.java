package com.gabor.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.gabor.abstracts.AbstractDog;
import com.gabor.dogs.Foxi;
import com.gabor.dogs.NemetJuhasz;
import com.gabor.person.Person;

public class Walk
{

	public static void main(String[] args)
	{
		Person person = new Person();

		NemetJuhasz nemetjuhasz = new NemetJuhasz(4, 20);
		person.walkWithDog(nemetjuhasz);

		List<AbstractDog> list = createList();

		Collections.sort(list);
		for (AbstractDog dog : list)
		{
			System.out.println(dog.mass);
		}
	}

	private static List<AbstractDog> createList()
	{
		Foxi foxi1 = new Foxi(4, 10);
		Foxi foxi2 = new Foxi(5, 12);
		Foxi foxi3 = new Foxi(6, 14);
		Foxi foxi4 = new Foxi(9, 11);
		Foxi foxi5 = new Foxi(8, 11);

		List<AbstractDog> list = new ArrayList<AbstractDog>();
		list.add(foxi1);
		list.add(foxi2);
		list.add(foxi3);
		list.add(foxi4);
		list.add(foxi5);

		return list;
	}

}
