package com.gabor.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.gabor.compare.StringComparator;

public class ThirdExercise
{

	public void thirdExerciseDefaultSolution(Stream<String> stream)
	{
		List<String> listOfWords = stream.map(text -> text.split(" ")).flatMap(Arrays::stream).collect(Collectors.toList());
		
		HashMap<String, Integer> map = new HashMap<>();
		Integer value = 1;
		
		for(String word : listOfWords)
		{
			if(map.containsKey(word))
			{
				value = map.get(word);
				map.put(word, ++value);
			}
			else
			{
				map.put(word, 1);
			}
		}
		
//		a treeset nem lesz jó mert az azonos hússzaukból csak az elsõt tartja meg
		
//		Set<Map.Entry<String, Integer>> treeSet = new TreeSet<Map.Entry<String, Integer>>( new Comparator<Map.Entry<String, Integer>>()
//		{
//			@Override
//			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2)
//			{
//				return o1.getValue() > o2.getValue() ? -1 : (o1.getValue() < o2.getValue())? 1 : 0;
////				return o1.getValue().compareTo(o2.getValue()) * -1;
//			}
//		});
		
//		treeSet.addAll(map.entrySet());
//		Iterator<Map.Entry<String, Integer>> iterator = treeSet.iterator();
		
		List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(map.entrySet());
		
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>()
		{
			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2)
			{
				return o1.getValue() > o2.getValue() ? -1 : (o1.getValue() < o2.getValue())? 1 : 0;
			}			
		});
		
		Iterator<Map.Entry<String, Integer>> iterator = list.iterator();
		int i=5;
		while(iterator.hasNext() && i > 0)
		{
			Map.Entry<String, Integer> pair = iterator.next();
			System.out.println(pair.getKey() + "=" + pair.getValue());
			i--;
		}
	}
	
	public void thirdExerciseWithLambda(Stream<String> stream)
	{
		stream.map(text -> text.split(" "))
				.flatMap(Arrays::stream)
				.collect(Collectors.toMap(word -> word, word -> 1, Integer::sum))
				.entrySet()
				.stream()
				.sorted((o1, o2) -> o1.getValue() > o2.getValue() ? -1 : (o1.getValue() < o2.getValue()) ? 1 :0)
				.limit(5)
				.forEach(word -> System.out.println(word.getKey() + "=" + word.getValue()));
	}
	
}
