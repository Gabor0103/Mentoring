package com.gabor.main;

public class Main {
	
	public static <T extends Object> void main(String[] args){
		T[] array = (T[])new Object[]{"a",2,3,5};
		
		T[] arrayWithSwapElements = switchElement(array, 0, 2);
		
		for(int index=0; index<arrayWithSwapElements.length; index++)
		{
			System.out.println("swaped array: " + arrayWithSwapElements[index]);
		}
	}
	
	public static <T extends Object> T[] switchElement(T[] inputArray, int from, int to){
		
		//T[] tempArray = new T[inputArray.length]; na ilyet nem lehet :P
		T temp1 = null;
		T temp2 = null;
		for(int index=0; index<inputArray.length; index++)
		{
			if(index == from)
			{
				temp1 = inputArray[index];
			}
			if(index == to)
			{
				temp2 = inputArray[index];
			}
		}
	
		inputArray[from] = temp2;
		inputArray[to] = temp1;
		
		return inputArray;
	}
}
