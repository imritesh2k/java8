package com.lambda.lambdaThread;

class myThread implements Runnable{

	@Override
	public void run() {
		System.out.println("Hi I am Thread");
	}
	
}

public class LambdaThread {

	public static void main(String[] args) {
		
		Runnable r = new myThread();
		Thread t = new Thread(r);
		t.start();
		
		Runnable r1 = () -> System.out.println("Hi I am lamda Thread");
		Thread t1 = new Thread(r1);
		t1.start();
		
			

	}

}
