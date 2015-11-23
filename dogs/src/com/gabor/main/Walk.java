package com.gabor.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.gabor.abstracts.AbstractDog;
import com.gabor.dogs.DogsSorting;
import com.gabor.dogs.Foxi;
import com.gabor.dogs.NemetJuhasz;
import com.gabor.dogs.Spaniel;
import com.gabor.person.Person;

public class Walk
{

	public static void main(String[] args)
	{
		Person person = new Person();

//		NemetJuhasz nemetjuhasz = new NemetJuhasz(4, 20);
//		person.walkWithDog(nemetjuhasz);
		
		//Abstract kutya implementalja a Comperable interface-t
		List<AbstractDog> list = createFoxiList();

		Collections.sort(list);
		for (AbstractDog dog : list)
		{
			System.out.println(dog.bark() + ", My weight is: " +dog.mass);
		}
		
		//Külön rendezõ osztály amely implementálja a Comperatot interface-t
		List<AbstractDog> spanielList = createSpanielList();
		Collections.sort(spanielList, new DogsSorting());
//		Collections.sort(spanielList);
		
		for(AbstractDog sp : spanielList)
		{
			System.out.println("I am a spaniel and my weight: " + sp.mass + " and my speed is: " + sp.speed);
		}
		
	}

	private static List<AbstractDog> createSpanielList()
	{
		Spaniel spaniel1 = new Spaniel(1,22);
		Spaniel spaniel2 = new Spaniel(4,20);
		Spaniel spaniel3 = new Spaniel(3,16);
		Spaniel spaniel4 = new Spaniel(5,29);
		Foxi foxi3 = new Foxi(6, 14);
		
		List<AbstractDog> list = new ArrayList<>();
		list.add(spaniel1);
		list.add(spaniel2);
		list.add(spaniel3);
		list.add(spaniel4);
		list.add(foxi3);

		return list;
	}
	
	private static List<AbstractDog> createFoxiList()
	{
		Foxi foxi1 = new Foxi(4, 10);
		Foxi foxi2 = new Foxi(5, 12);
		
		Foxi foxi4 = new Foxi(9, 11);
		Foxi foxi5 = new Foxi(8, 11);

		List<AbstractDog> list = new ArrayList<AbstractDog>();
		list.add(foxi1);
		list.add(foxi2);
		//list.add(foxi3);
		list.add(foxi4);
		list.add(foxi5);

		return list;
	}

}
