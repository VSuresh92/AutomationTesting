package learningjava;

public class OverRidingNew extends OverRiding{

	public static void main(String[] args)
	{
		OverRidingNew obj = new OverRidingNew();
		OverRiding obj1 = new OverRiding();
		
		
		/*obj.eat();
		obj.add(100, 20);
		*/
		
		obj1.add(100, 200);
		obj1.eat();
	}
	//Overridiing
	public void eat()
	{
		System.out.println("Suresh");
	}
	
	//Overridiing
	public void add(int x,int y)
	{
		int sum = x+y;
		System.out.println(sum);
		
	}
	
}
