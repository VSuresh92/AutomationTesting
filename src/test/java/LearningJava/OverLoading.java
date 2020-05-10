package LearningJava;

public class OverLoading extends OverRiding
	{
	public static void main(String[] args) {
		
		OverLoading obj = new OverLoading();
		obj.add(10, 20);
		obj.add(50, 20, 10);
		obj.add("Suresh");
		obj.add("s s s s s");
		
	}		

	public void add(int a,int b)
	{
		int sum;
		sum = a+b;
		System.out.println(sum);
	}
	
	public  void add(int c,int d,int f)
		{
		float min;
		min = c-d-f;
		System.out.println(min);
		}  
	
	public void add(String e)
		{
		System.out.println(e);
		} 	
	public void add (char h)
	{
	System.out.println(h);
	} 
	}

