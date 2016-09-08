package com.gabor.reader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Reader 
{
	public Stream<String> readInput()
	{
		try 
		{
			return 
				removeCharacters(Files.lines(Paths.get("E:\\mentoring\\gitMentoring\\Mentoring\\StringProcessor\\resources\\27769_de-saint-exupery-antoine_the-little-prince.txt")));
//					removeCharacters(Files.lines(Paths.get("E:\\mentoring\\mentoringWorkspace\\StringProcessor\\resources\\example.txt")));
			
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		return Stream.empty();
	}
	
	private Stream<String> removeCharacters(Stream<String> input)
	{
		return (input.map(x -> x.replace(".", ""))
				.map(x -> x.replace(",", ""))
				.map(x -> x.replace("\"", "")));
	}
	
}
