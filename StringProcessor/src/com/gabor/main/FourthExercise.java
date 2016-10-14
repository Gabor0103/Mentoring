package com.gabor.main;

import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.gabor.compare.StringComparator;

public class FourthExercise
{

	public void fourthExerciseDefaultSolution(Stream<String> stream)
	{
		//javítani!!
		List<String> listOfWords = stream.map(text -> text.split(" ")).flatMap(Arrays::stream).collect(Collectors.toList());
		
		TreeMap<String, Integer> treeMap = new TreeMap<>(new StringComparator());
		Integer value = 1;
		
		for(String word : listOfWords)
		{
			if(treeMap.containsKey(word))
			{
				value = treeMap.get(word);
				treeMap.put(word, ++value);
			}
			else
			{
				treeMap.put(word, 1);
			}
		}
		System.out.println(treeMap.firstEntry());
	}
	
	public void fourthExerciseWithLambda(Stream<String> stream)
	{
		stream.map(text -> text.split(" "))
				.flatMap(Arrays::stream)
				.collect(Collectors.toMap(word -> word, word -> 1, Integer::sum))
				.entrySet()
				.stream()
				.sorted((o1, o2) -> o1.getValue() > o2.getValue() ? -1 : (o1.getValue() < o2.getValue()) ? 1 :0)
				.limit(1)
				.forEach(entry -> System.out.println(entry.getKey() + "=" + entry.getValue()));
				
	}
}
