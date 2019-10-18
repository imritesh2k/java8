package com.interfacejava8;

public interface InterfaceStatic {
	
	default void print(String str) {
		System.out.println(str);
	}
	
	static boolean print1(String str) {
		System.out.println(str);
		if(str!=null) {
			return true;
		}
		return false;
	}
}
