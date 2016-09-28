package com.gabor.main;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collector;
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
		
//		System.out.println("Numer of words without recurrence: " + 
//				stream.map(word -> word.split(" ")).flatMap(Arrays::stream).distinct().count());
		
		//solution with LAMBDA
//		List<String> list = stream.map(word -> word.split(" ")).flatMap(Arrays::stream).distinct().collect(Collectors.toList());
//		stream.map(word -> word.split(" ")).flatMap(Arrays::stream).distinct().sorted(sc).limit(5).forEach(x -> System.out.print(x + " "));
		
//		Set<String> setOfWords = stream.map(text -> text.split(" ")).flatMap(Arrays::stream).collect(Collectors.toSet());
//		System.out.println("Numer of words without recurrence: " + setOfWords.size());
//		
//		//---------------- 2. exercise ----------------
		
//		StringComparator sc = new StringComparator();
//		stream.map(word -> word.split(" ")).flatMap(Arrays::stream).distinct().sorted(sc).limit(5).forEach(System.out::println);

//		StringComparator sc = new StringComparator();		
//		
//		TreeSet<String> ts = new TreeSet<>(sc);
//		//Queue<String> q = new LinkedList<String>();
//		
//		ts.addAll(setOfWords);
//		//q.addAll(ts);
//		
//		Iterator<String> iterator = ts.iterator();
//		
//		int i = 10;		
//		while(iterator.hasNext() && i > 0)
//		{
//			System.out.println("word: " + iterator.next());
//			--i;
//		}
		
		//---------------- 3-5. exercise ---------------- https://www.mkyong.com/java/how-to-sort-a-map-in-java/
//		StringComparator sc = new StringComparator();
//		HashMap<String, Integer> map = new HashMap<>();
//		int value = 1;
//		stream.map(text -> text.split(" ")).flatMap(Arrays::stream).sorted(sc).forEach(word -> map.containsKey(word) ? map.put(word, ++value) : map.put(word, 1));
		
	
		
//		List<String> listOfWords = stream.map(text -> text.split(" ")).flatMap(Arrays::stream).collect(Collectors.toList());
//		
//		List<String> ignorList = new ArrayList<String>();
//		ignorList.add("the");
//		ignorList.add("I");
//		ignorList.add("to");
//		ignorList.add("a");
//		ignorList.add("and");
//		ignorList.add("of");
//		ignorList.add("");
//		
//		HashMap<String, Integer> map = new HashMap<>();
//		Integer value = 1;
//		
//		for(String word : listOfWords)
//		{
//			if(!ignorList.contains(word))
//			{
//				if(map.containsKey(word))
//				{
//					value = map.get(word);
//					map.put(word, ++value);
//				}
//				else
//				{
//					map.put(word, 1);
//				}
//			}
//		}
//		
//		List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(map.entrySet());
//		
//		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>()
//		{
//			@Override
//			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2)
//			{
//				return o1.getValue() > o2.getValue() ? -1 : (o1.getValue() < o2.getValue())? 1 : 0;
//				return o1.getValue().compareTo(o2.getValue()) * -1;
//			}
//			
//			
//		});
//		
//		Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
//		
//		for (Map.Entry<String, Integer> entry : list)
//		{
//			sortedMap.put(entry.getKey(), entry.getValue());
//		}
//		
//		Iterator<Map.Entry<String, Integer>> it = list.iterator();
//		int j=10;
//		while(it.hasNext() && j > 0)
//		{
//			Map.Entry<String, Integer> pair = it.next();
//			System.out.println(pair.getKey() + "=" + pair.getValue());
//			j--;
//		}
//		 
		//----------------V2---------------------------
//		
//		Set<Map.Entry<String, Integer>> treeSet = new TreeSet<Map.Entry<String, Integer>>( new Comparator<Map.Entry<String, Integer>>()
//		{
//			@Override
//			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2)
//			{
//				return o1.getValue() > o2.getValue() ? -1 : (o1.getValue() < o2.getValue())? 1 : 0;
//				return o1.getValue().compareTo(o2.getValue()) * -1;
//			}
//		});
//		
//		treeSet.addAll(map.entrySet());
//		System.out.println("------------------------------");
//		Iterator<Map.Entry<String, Integer>> iterator = treeSet.iterator();
//		int j2=10;
//		while(iterator.hasNext() && j2 > 0)
//		{
//			Map.Entry<String, Integer> pair = iterator.next();
//			System.out.println(pair.getKey() + "=" + pair.getValue());
//			j2--;
//		}
//		
		//---------------- 4. exercise ----------------
//		List<String> listOfWords2 = stream.map(text -> text.split(" ")).flatMap(Arrays::stream).collect(Collectors.toList());
//		
//		
//		TreeMap<String, Integer> treeMap = new TreeMap<>(sc);
//		Integer value2 = 1;
//		
//		for(String word : listOfWords2)
//		{
//			if(!ignorList.contains(word))
//			{
//				if(treeMap.containsKey(word))
//				{
//					value2 = treeMap.get(word);
//					treeMap.put(word, ++value2);
//				}
//				else
//				{
//					treeMap.put(word, 1);
//				}
//			}
//		}
//		
//		System.out.println(treeMap.firstEntry());
	}

}
