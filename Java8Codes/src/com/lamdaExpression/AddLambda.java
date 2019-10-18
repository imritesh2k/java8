package lamdaExpression;

interface AddInterface{
	//public int add(int a, int b);
	public void m1();
}

public class AddLambda {

	public static void main(String[] args) {
		/*AddInterface add1 = (x,y)->(x+y);
		System.out.println(add1.add(10, 20));*/
		AddInterface ai = ()->System.out.println("Hello");
	 }

}


