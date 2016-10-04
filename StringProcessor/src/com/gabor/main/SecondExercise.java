package com.gabor.main;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.gabor.compare.StringComparator;

public class SecondExercise {
	
	public void secondExercise(Stream<String> stream)
	{
		Set<String> setOfWords = stream.map(text -> text.split(" ")).flatMap(Arrays::stream).collect(Collectors.toSet());
		
		StringComparator sc = new StringComparator();		
		
		TreeSet<String> ts = new TreeSet<>(sc);
		
		ts.addAll(setOfWords);
		Iterator<String> iterator = ts.iterator();
		
		int i = 10;		
		while(iterator.hasNext() && i > 0)
		{
			System.out.println("word: " + iterator.next());
			--i;
		}
	}
	
	
	public void secondExerciseWithLambda(Stream<String> stream)
	{
		stream
			.map(word -> word.split(" "))
			.flatMap(Arrays::stream)
			.distinct()
			.sorted(new StringComparator())
			.limit(5)
			.forEach(System.out::println);
	}
}
