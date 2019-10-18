package com.interfacejava8;

interface Interf {
	public void m1();

}

class Demo implements Interf{

	@Override
	public void m1() {
		System.out.println("m1");
		
	}
	
}

public class InterfWithoutLambda {
	public static void main(String[] args) {
		Interf i1 = new Demo();
		i1.m1();
	}
}
