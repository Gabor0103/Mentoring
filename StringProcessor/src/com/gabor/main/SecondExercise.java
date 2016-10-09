package com.gabor.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.gabor.compare.StringComparator;

public class SecondExercise {
	
	public void secondExerciseDefaultSolution(Stream<String> stream)
	{
		Set<String> setOfWords = stream.map(text -> text.split(" ")).flatMap(Arrays::stream).collect(Collectors.toSet());
				
		//ebben az esetben ha két szó azonos hosszúságú, akkor az elsõ megtaláltat rakja bele a treeSetbe a többit nem
		//TreeSet<String> ts = new TreeSet<>(sc);
		//ts.addAll(setOfWords);
		//Iterator<String> iterator = ts.iterator();
		
		List<String> list = new ArrayList<>(setOfWords);
		Collections.sort(list, new StringComparator());
		Iterator<String> iterator = list.iterator();
		
		int i = 5;		
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
			.forEach(word -> System.out.println("word: " + word));
	}
}
