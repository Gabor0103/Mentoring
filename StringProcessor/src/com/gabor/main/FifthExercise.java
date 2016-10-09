package com.gabor.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FifthExercise
{
	List<String> ignoreList = Arrays.asList("w", "hat", "a");
	
	public void fifthExerciseDefaultSolution(Stream<String> stream)
	{
		List<String> listOfWords = stream.map(text -> text.split(" ")).flatMap(Arrays::stream).collect(Collectors.toList());
		

		
		List<String> ignoredListOfWords = new ArrayList<>();
		
		for(String word : listOfWords)
		{
			if(!ignoreList.contains(word))
			{
				ignoredListOfWords.add(word);
			}
		}
		
		for (String word : 	ignoredListOfWords)
		{
			System.out.println(word);
		}
	}
	
	public void fifthExerciseWithLambda(Stream<String> stream)
	{ 
		stream.map(text -> text.split(" "))
				.flatMap(Arrays::stream)
				.filter(word -> !ignoreList.contains(word))
				.collect(Collectors.toList())
				.forEach(System.out::println);
	}
}
