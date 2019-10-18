package com.lambda.labdabasics;

interface FirstLambda{
	public void m1();
}
public class Lambda1{

	public static void main(String[] args) {
		FirstLambda fl = ()->System.out.println("Hello");
	}
}
