package com.gabor.main;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class FirstExercise 
{
		
	public void firstExercise(Stream<String> stream)
	{
		Set<String> setOfWords = stream.map(text -> text.split(" ")).flatMap(Arrays::stream).collect(Collectors.toSet());
		
		System.out.println("Numer of words without recurrence: " + setOfWords.size());
	}
	
	public void firstExerciseWithLambda(Stream<String> stream)
	{
		System.out.println("Numer of words without recurrence: " + 
		stream
		.map(word -> word.split(" "))
		.flatMap(Arrays::stream)
		.distinct()
		.count());
	}
}
