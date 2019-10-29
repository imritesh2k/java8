package com.comparator.lamdaExpression;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainClassComparatorLamda {

	public static void main(String[] args) {
		List<Integer> l1 = Arrays.asList(3,21,9,15,6,30);
		Collections.sort(l1,(i1,i2) -> i1>i2 ? -1 : i1<i2 ? 1 : 0);
		System.out.println(l1);
		

	}

}
