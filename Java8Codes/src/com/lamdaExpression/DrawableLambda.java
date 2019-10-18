package lamdaExpression;

interface Drawable {
	//public void draw();
	public String draw(String drawName);

}


public class DrawableLambda {
	public static void main(String[] args) { 
		int width = 10;
		
		/*Drawable d = new Drawable() {
			@Override
			public void draw() {
				System.out.println("Width : "+width);
			}
		};
		d.draw();
		
		Drawable d = () -> System.out.println("Width : "+width);
		d.draw();*/
		
		/*Drawable d = new Drawable() {
			
			@Override
			public String draw(int i) {
				// TODO Auto-generated method stub
				return String.valueOf(i);
			}
			
			@Override
			public void draw() {
				// TODO Auto-generated method stub
				
			}
		};*/
		
		String drawVar = "circle";
		
		Drawable d = (String drawName)-> drawName;
		
		
	}
}
