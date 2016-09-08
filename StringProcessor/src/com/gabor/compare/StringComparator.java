package com.gabor.compare;

import java.util.Comparator;

public class StringComparator implements Comparator<String>
{

	@Override
	public int compare(String string1, String string2)
	{
		return string1.length() < string2.length() ? 1 : (string1.length() > string2.length()) ? -1 : 0;
	}


}
