package methodReference;

interface Sayable{
	void say();
}

public class MethodReference {
	
	public static void saySomthing(){
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		Sayable say = MethodReference::saySomthing;
		say.say();
	}

}
