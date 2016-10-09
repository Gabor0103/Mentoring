package com.gabor.main;


import java.util.stream.Stream;

import com.gabor.reader.Reader;

public class Main
{	
	private static Stream<String> readInputFile(Reader reader)
	{
		return reader.readInput();
	}
	
	public static void main(String[] args)
	{	    
		Reader reader = new Reader();
		
		FirstExercise fe = new FirstExercise();
		SecondExercise se = new SecondExercise();
		ThirdExercise te = new ThirdExercise();
		FourthExercise foe = new FourthExercise();
		FifthExercise fie = new FifthExercise();
		
		System.out.println("---------------- 1. exercise ----------------");
		
		fe.firstExerciseDefaultSolution(readInputFile(reader));
		
		System.out.println("------------");
		
		fe.firstExerciseWithLambda(readInputFile(reader));
	
		System.out.println("---------------- 2. exercise ----------------");
		
		se.secondExerciseDefaultSolution(readInputFile(reader));
		
		System.out.println("------------");

		se.secondExerciseWithLambda(readInputFile(reader));
		
		System.out.println("---------------- 3. exercise ----------------");
		
		te.thirdExerciseDefaultSolution(readInputFile(reader));
		
		System.out.println("------------");
		
		te.thirdExerciseWithLambda(readInputFile(reader));
	
		System.out.println("---------------- 4. exercise ----------------");

		foe.fourthExerciseDefaultSolution(readInputFile(reader));
		
		System.out.println("------------");
		
		foe.fourthExerciseWithLambda(readInputFile(reader));
		
		System.out.println("---------------- 5. exercise ----------------");
		
		fie.fifthExerciseDefaultSolution(readInputFile(reader));
		
		System.out.println("------------");
		
		fie.fifthExerciseWithLambda(readInputFile(reader));
	}

}
