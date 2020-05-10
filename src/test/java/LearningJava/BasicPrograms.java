package LearningJava;


public class BasicPrograms {

	
	public static void hexaware()
	{
		for(int i=0;i<3;i++)
		{
			for(int j=3;j>=i;j--)
			{
				if(i==j)
				break;
				System.out.println(i+ " " +j);
			}
		}
		
		
	}
	
	public static void printArray()
	{
		int[] value = new int[5];
		value[0] = 9;
		value[1] = 5;
		value[2] = 1;
		value[3] = 2;
		value[4] = 3;
		
		for(int i=0;i<value.length;i++)
		{
			System.out.println(value[i]);
		}
		
	}
	public static void reverseArray()
	{
		char[] ch = {'s','u','r','e','s','h'};
		
		for(int i=ch.length-1;i>=0;i--)
		{
			
			System.out.println(ch[i]);
		}
		
	}
	
	public static void reverseArray1()
	{
		
		int[] values = {10,1,8,5,6,9}; 
		
		for(int i=0;i<values.length;i++)
		{
			System.out.println("Array given Order :" +values[i]);
		}
		
		for(int i=values.length-1;i>=0;i--)
		{
			System.out.println("Array reverse Order :");
			System.out.println(values[i]);
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		BasicPrograms obj = new BasicPrograms();
		obj.hexaware();
		basicPrograms.BasicPrograms.hexaware();
		BasicPrograms.hexaware();*/
		hexaware();
		printArray();
		reverseArray();	
		reverseArray1();
		
		
		}

	
}
