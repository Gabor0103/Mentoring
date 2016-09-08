package com.gabor.main;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.gabor.compare.StringComparator;
import com.gabor.reader.Reader;

public class Main
{

	public static void main(String[] args)
	{
		Reader reader = new Reader();
		
		Stream<String> stream = reader.readInput();
		
		//---------------- 1. exercise ----------------
		
		//solution with LAMBDA
		//List<String> list = stream.map(word -> word.split(" ")).flatMap(Arrays::stream).distinct().collect(Collectors.toList());
//		
//		Set<String> setOfWords = stream.map(text -> text.split(" ")).flatMap(Arrays::stream).collect(Collectors.toSet());
//		System.out.println("Numer of words without recurrence: " + setOfWords.size());
		
		//---------------- 2. exercise ----------------
		
//		StringComparator sc = new StringComparator();
//		
//		TreeSet<String> ts = new TreeSet<>(sc);
//		
//		ts.addAll(setOfWords);
//		
//		Iterator<String> iterator = ts.iterator();
//		
//		int i = 10;		
//		while(iterator.hasNext() && i > 0)
//		{
//			System.out.println("word: " + iterator.next());
//			--i;
//		}
		
		//---------------- 3-4. exercise ---------------- https://www.mkyong.com/java/how-to-sort-a-map-in-java/
		List<String> listOfWords = stream.map(text -> text.split(" ")).flatMap(Arrays::stream).collect(Collectors.toList());
		
		List<String> ignorList = new ArrayList<String>();
		ignorList.add("the");
		ignorList.add("I");
		ignorList.add("to");
		ignorList.add("a");
		ignorList.add("and");
		ignorList.add("of");
		ignorList.add("");
		
		HashMap<String, Integer> map = new HashMap<>();
		Integer value = 1;
		
		for(String word : listOfWords)
		{
			if(!ignorList.contains(word))
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
		}
		
		List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(map.entrySet());
		
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>()
		{
			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2)
			{
				return o1.getValue() > o2.getValue() ? -1 : (o1.getValue() < o2.getValue())? 1 : 0;
			}
			
		});
		
		Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
		
		for (Map.Entry<String, Integer> entry : list)
		{
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		
		Iterator it = sortedMap.entrySet().iterator();
		int j=10;
		while(it.hasNext() && j > 0)
		{
			Map.Entry pair = (Map.Entry)it.next();
			System.out.println(pair.getKey() + "=" + pair.getValue());
			j--;
		}
	}

}
