package LearningJava;

public class Final {

	public static final int value=10;
	static int data =50;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		final int value = 10;
		final int x=value;
		final int y=x+value;
		
		
		System.out.println(y);
		
		//Call by value 
		method();
		change(data);
		change(y);
	
		
	}
	
	public static void method()
	{
		
		//System.out.println(value+10);
		data = data+10;
		System.out.println(data);
	}
	
	public static void change(int data)
	{
	
		data =data+100;
		System.out.println(data);
	}
}
