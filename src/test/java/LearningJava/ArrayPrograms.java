package LearningJava;

import java.util.ArrayList;
import java.util.List;

public class ArrayPrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
	}
	public static void findIndex()
	{
		int[] value = {'2','1','7','3','4','5'};
		for(int i=0;i<=value.length;i++)
		{
			System.out.println(value[i]);
		}
		
		
		
		
		
		
		
		
	}
	public static void reverseStringArray()
	{
		char[] ch = {'S','U','R','E','S','H'};
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.println(ch[i]);
		}
	}
	public static void reverseString()
	{
		String str = "BHARANI";
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.println(str.charAt(i));
		}
	}
}
