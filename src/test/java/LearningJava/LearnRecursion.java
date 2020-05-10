package LearningJava;

public class LearnRecursion {
	
	static int a = 10;
	static int b = 20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for(int i=0;i<=10;i++)
		{
			//System.out.println("Value of i is :" +i);
			recursion();
			System.out.println(number(10));
			for(int j=0;j<=i;j++)
			{
				//System.out.println("Value of j is :" +j);
				recursion("Suresh");
				
			}
		}
		 System.out.println(number(10));
		 
			 
		 System.out.println(factorial(6));
		 fibonacci();
		 
		
	}
	
	public static void recursion()
	
	{
		System.out.println("Learn recursion");
		
	}
	public static void recursion(String S)
	{
		System.out.println(S);
	}
	
	public static int number(int n)
	{
		return (n * (n-1)) ;
		
	}
	public static int factorial(int n)
	{

		 if(n==1)
		 {
			 return 1;
		 }
		 else
		 {
			 return (n * factorial(n-1)) ; 
		 }
	}
	public static void fibonacci()
	{
		
		
		{
		int n1=0,n2=1;
		System.out.println(n1+" "+n2);
		
		for(int i=2;i<=10;i++)
		{
		int n3=n1+n2;
		System.out.println("" +n3);
		n1=n2;
		n2=n3;
		}
		}
		
		
		
	}

}
