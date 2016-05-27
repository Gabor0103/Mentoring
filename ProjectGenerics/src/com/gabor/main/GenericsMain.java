package com.gabor.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericsMain {

	public static void main(String[] args) {
		
		List<? extends Number> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,1024));
		
		Even evenCheker = new Even<Number>();
		Odd oddChecker = new Odd<Number>();
		
		Integer numberEven = typeOfNumber(numbers, evenCheker);
		Integer numberOdd = typeOfNumber(numbers, oddChecker);
		
		System.out.println(numberEven);
		System.out.println(numberOdd);
	}
//
//	public static Integer typeOfNumber(List<? extends Number> list)
//	{
//		int i = 0;
//		for(Number number : list)
//		{
//			if(number.intValue() % 2 == 0)
//			{
//				i = i + 1;
//			}
//		}
//		
//		return i;
//	}
	
	public static <L extends Number> Integer typeOfNumber(List<L> list, ICheck<L> checker)
	{
		int i = 0; 
		for(L number : list)
		{
			if(checker.isTrue(number))
			{
				i++;
			}
		}
		return i;
		
	}
	
}
