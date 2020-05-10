package LearningJava;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ArrayInterviewQuesns {
	

	public static void main(String[] args) {
	
		//ArrayInterviewQuesns obj = new ArrayInterviewQuesns();
		//obj.SoringArray();
		//findDuplicate2();
		//findPositiveNegative();
		
	}


	//Quesn 1
	
	public static void interviewQuesn1()
	{
		int[] i = new int[1];
		 
        System.out.println(i[1]);
	}
	
	//Quesn 2
	public static void interviewQuesn2()
	{
			int[] a = new int[3];
	        a[1] = 50;
	        Object o = a;
	        System.out.println(a[1]);
	        
	        int[] b = (int[])o;
	        b[1] = 100;
	        
	        System.out.println(a[1]);
	        System.out.println(b[1]);
	        ((int[])o)[1] = 500;
	        System.out.println(a[1]);
	}

	//3.Sorting an array into ascending order
	public static void SoringArray()
	{
		int a[] = {7,2,9,4,3,5,10},b,c;
		 
		 for(int i=0;i<a.length;i++)
		 {		
			 for(int j=i+1;j<a.length;j++)
			 {
				 if(a[i]>a[j])
				 {
					 b=a[i];
					 a[i]=a[j];
					 a[j]=b;
				 }
				 
			 }
			 System.out.println("Ascending order : "+a[i]+ " " +i);
			 if(i>a.length)
			 {
				 break;
			 }
		 }
			 System.out.println("The second minimum value is : " +a[0]);
		 for(int i =0;i<a.length;i++)
		 {
			 for(int j=i+1;j<a.length;j++)
			 {
				if(a[i]<a[j])
				{
					c=a[i];
					a[i]=a[j];
					a[j]=c;
				}
			 }
			 System.out.println("Descending order : "+a[i]+ " " +i);
			 if(i> a.length)
			 {
				 break;
			 }
		 }
		 System.out.println("The second maximum value is : " +a[2]);
	}
	
	//Quesn 4
	public static void removeWowels()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string value is : ");
		String inputString = sc.nextLine();
		String newinputString = inputString.replaceAll("[AEIOUaeiou]", "");
		System.out.println("The string without wowels : ");
		System.out.println(newinputString);
		removeWowels();
	}
	
	//Quesn 5
	public static void findDuplicate()
	{
		int a[] = {7,2,9,4,3,5,10,5,7},temp;
		
		for(int i=0;i<=a.length-1;i++)
		{
		for(int j=i+1;j<=a.length-1;j++)
		{
			if(a[i]==a[j])
			{
				System.out.println(a[i]);
			}
		}

		}
	}
	
	//Quesn 6
	public static void findDuplicate1()
	{
		int a[] = {7,2,9,4,3,5,10,5,7};
		
		Set<Integer> duplicate = new LinkedHashSet<Integer>();
		for(int i=0;i<=a.length;i++)
		{
		for(int j=i+1;j<=a.length-1;j++)
		{
			if(a[i]==a[j])
			{
				duplicate.add(a[i]);
				System.out.println(duplicate);
		
			}
		}
		}
		
		
		
	}
	
	//Quesn 7
	public static void findDuplicate2()
	{
		int a[] = {7,2,9,2,4,3,5,10,5,7},count=0;
		
		String str = "HEXAWARE";
		char[] ch = str.toCharArray();
		System.out.println(ch);
		
		Set<Integer> duplicate = new HashSet<Integer>();
		Set<Integer> dup = new TreeSet<Integer>();
		
		for(Character c : ch)
		{
			if(c== 'A')
			{
				count++;
				
			}
		}
		System.out.println(count);
		
		
		for(Integer val : a)
		{
			if(!duplicate.add(val))
			{
				System.out.println(val);
			}
	
		}
		
		
	}
	
	//Quesn 8
	public static void learning()
	{
		String c=new String("test");
		String d=new String("test");
		
	System.out.println(c.equals(d));
	int a[] = {7,9,2,4,3,5,10},b;
	int e[] = Arrays.copyOf(a, a.length);

	 for(int i=0;i<a.length;i++)
	 {		
		 for(int j=i+1;j<a.length;j++)
		 {
			 if(a[i]>a[j])
			 {
				 b=a[i];
				 a[i]=a[j];
				 a[j]=b;
			 }
			 
		 }
	 }
	 System.out.println(a[1]);
	 for(int i=0;i<e.length;i++)
	 {
		 if (e[i]==a[1])
		 {
			 System.out.println("The second mininum value index is : "+i);
			 break;
		 }
		
	 }
	
	}
	//Quesn 9
	public static void findPositiveNegative()
	{
		int a[] = {1,5,-3,-6,-10,3,7,8,9};
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>0)
			{	
				
				System.out.println("Positive numbers :" +a[i]);
				System.out.println(a.length);
			}
			else if(a[i]<0)
			{
				System.out.println("Negative numbers :" +a[i]);
			}
		}
	}
	

	
}
