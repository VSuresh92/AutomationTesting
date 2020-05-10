package LearningJava;

import javax.swing.plaf.synth.SynthStyle;

public class Shapeslogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//printL(5);
		//printLreverse(5);
		//printSquare(10);
		//printTriangle(5);
		//printPyramid(5);
		//printStar(5);
		sumOfStrings1();
	}
	
	
	public  static void printL(int n)
	{
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();	
		}
	}
	
	public  static void printLreverse(int n)
	{
		
		for(int i=n;i>=1;i--)// 5,4,3,2,1
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	public static void printSquare(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	public static void printTriangle(int n)
	{
		for(int i=1;i<=n;i++) // 5,4,3,2,1
		{
			for(int j=n-1;j>=i;j--)//4,3,2,1
			{
				System.out.print(" ");
			}
			for(int k=1;k<=(2*i-1);k++)//4,3,2,1,*
			{
				System.out.print(k);
			}
			System.out.println();
		}
	}
	
	public static void printPyramid(int n)
	{
		for(int i=n;i>=1;i--)
		{
			for(int j=n;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<(2*i);k++)
			{
				System.out.print(k);
			}
			System.out.println();
		}
		
	}
	
	public static void printStar(int n)
	{
		for(int i=1;i<=n;i++) // 5,4,3,2,1
		{
			for(int j=n-1;j>=i;j--)//4,3,2,1
			{
				System.out.print(" ");
			}
			for(int k=1;k<(2*i);k++)//4,3,2,1,*
			{
				System.out.print(k);
			}
			System.out.println();
		}
		for(int i=n;i>=1;i--)
		{
			for(int j=n;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<(2*i);k++)
			{
				System.out.print(k);
			}
			System.out.println();
		}
		
	}
	
	public static void sumOfStrings()
	{	
		int sum=0;
		String str = "10abc10";
		String num ="";
		char[] ch =str.toCharArray();
		System.out.println(ch);
		for(int i=0;i<ch.length;i++)
		{
			if(Character.isDigit(ch[i]))
			{
				num = num +ch[i];
				System.out.println(ch[i]);
				//System.out.println(num);
			}
			else if (!num.equals(""))
			{
				sum = sum + Integer.parseInt(num);
			}
		}
		System.out.println(sum);
		
	}
	
	public static void sumOfStrings1()
	{	
		int sum =0;
		
		String str = "12 abc 34 abc 56";
		String st = str.replaceAll("[\\D]", "");
		System.out.println(st);
		
		
		char[] ch = st.toCharArray();
		System.out.println(ch.length);
		
		for(int i=0;i<ch.length;i++)
		{	
			int temp = Character.getNumericValue(ch[i]);
			System.out.println(temp);
			sum = sum + temp;
		}
		System.out.println(sum);
	}
}
