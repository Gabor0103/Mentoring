package com.gabor.main;

import java.util.Comparator;

public final class FinalGeneric<T extends Comparable<T>> implements Comparator<T> 
{
    public static <T> T max(T x, T y) {
    	
    	//A "T" t�pus nem defini�l semmilyen oper�tort, nek�nk kellene az �sszehasonl�t�st megcsin�lni(?)
        return x > y ? x : y;
    }

	@Override
	public int compare(T o1, T o2)
	{
		return o1.compareTo(o2);
	}

}