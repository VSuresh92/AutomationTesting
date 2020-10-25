package learningjava;

public class Static {
	
	public static int value=5;
	public  final int val =10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Static a1 = new Static();
		Static a2 = new Static();
		
		Static.value = 20;
		int val=100;
		a1.method();
		
	}
	
	public void method()
	{
	int val=100;
	switch(val/10)
	{
	case 100 : System.out.println("10");
	break;
	case 90 : System.out.println("20");
	break;
	case 10 : System.out.println("10");
	break;
	
	}
	
	}

}
