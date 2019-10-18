package com.interfacejava8;

class MyGeneralClass{
	public void myMethodHello() {
		System.out.println("My Method Hello");
	}
}

public class MyClassStatic extends MyGeneralClass implements InterfaceStatic{

	public static void main(String[] args) {
		
		
		MyGeneralClass myGeneralClass = new MyGeneralClass();
		myGeneralClass.myMethodHello();
		
		new MyClassStatic().methodMyClass();
		
		System.out.println(InterfaceStatic.print1("hii"));

	}
	
	public void methodMyClass() {
		InterfaceStatic.super.print("hello");
	}

}
