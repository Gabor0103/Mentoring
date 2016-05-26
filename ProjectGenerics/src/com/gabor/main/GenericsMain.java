package com.gabor.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericsMain {

	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		
		Integer number = typeOfNumber(numbers);
		
		System.out.println(number);
	}

	public static Integer typeOfNumber(List<Integer> list)
	{
		int i = 0;
		for(Integer number : list)
		{
			if(number % 2 == 0)
			{
				i = i + 1;
			}
		}
		
		return i;
	}
	
}
