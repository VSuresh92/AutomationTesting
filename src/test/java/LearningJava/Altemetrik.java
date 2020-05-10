package LearningJava;

	public class Altemetrik {
	
		public void A()
		{
			System.out.println("Method 1");
		}
	
	public class B extends Altemetrik
	{
		public  void B()
		{
			System.out.println("Method 2");
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Altemetrik obj = new Altemetrik();
		obj.A();
		
		
	}


}
