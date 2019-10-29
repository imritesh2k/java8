package com.comparator.general;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



class MyComperator implements Comparator<Integer> {

	@Override
	public int compare(Integer i1, Integer i2) {
		return i1<i2 ? 1 : i1>i2 ? -1 : 0;
	}
}

public class MainClassComparator{
	public static void main(String[] args) {
		List l1 = Arrays.asList(5,21,10,9,6,15);
		Collections.sort(l1, new MyComperator());
		System.out.println(l1);
	}
}
