package com.gabor.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.gabor.abstractclasses.AbstractDog;
import com.gabor.dogs.DogsInAnonymClass;
import com.gabor.dogs.DogsInAnonymClass.Puli;
import com.gabor.person.Person;

public class Main
{

	public static void main(String[] args)
	{
		Puli staticPuli = new Puli();//static member class
		System.out.println(staticPuli.walk());

		DogsInAnonymClass.Kuvasz kuvasz = new DogsInAnonymClass().new Kuvasz();//non-static (inner) class
		System.out.println(kuvasz.walk());
		
		Person person = new Person();
		person.walkWithDog(new AbstractDog(){//real anonymous class
			
			@Override
			public String bark()
			{
				return "I am a noname dog";
			}
			
		});
		
		DogsInAnonymClass dog = new DogsInAnonymClass();
		dog.goWalk();//local inner class
		
		List<Integer> list = createList();
		Collections.sort(list, new Comparator<Integer>(){

			@Override
			public int compare(Integer o1, Integer o2)
			{
				return o2-o1;
			}
		});
		System.out.println(list);
	}
	
	public static List<Integer> createList()
	{
		List<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(9);
		list.add(1);
		list.add(3);
		return list;
	}
}
