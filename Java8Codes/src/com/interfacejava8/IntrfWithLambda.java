package com.interfacejava8;

interface Intf{
	public void m1();
}

public class IntrfWithLambda {

	public static void main(String[] args) {
		Intf intf = () -> System.out.println("m1");
		intf.m1();

	}

}
