package learningjava;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ArrayConcepts {
	
	static String inputString = "code_review";

	public static void main(String[] args) 
	
	{
		ArrayConcepts obj = new ArrayConcepts();
		/*obj.reverse();
		obj.pushPop();*/
		final String inputString = "MSC";
	 	final String reversed = reverseString(inputString);
	 	System.out.println("The reversed string is " +reversed);
	 	duplicate();
	 	pushPop();
	}
	
	public void reverse()
	{
		
		String str = "HEXAWARE";
		char[] ch = str.toCharArray();
		char[] ch1 = {'M','S','C'};
		
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.println(str.charAt(i));
		}
		
		for(int i=ch1.length-1;i>=0;i--)
		{
			System.out.println(ch1[i]);
			
		}
	}
	
	public static void duplicate()
	{
		String str = "COGNIZANT";
		char[] ch = str.toCharArray();
		System.out.println(ch);
		
		for(int i=0;i<ch.length;i++)
		{
			for (int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					System.out.println("The duplicate value is " +ch[i]+ " " +i+ " " +j );
				}
			}
		}
	}
	
	public static void pushPop()
	{
		
		String s1="abc";
		String s2 ="def";
		Stack stack = new Stack();
		stack.push(s1);
		stack.push(s2);
		System.out.println(stack.push(s1));
		System.out.println(stack.push(s2));
		String s3 = (String) stack.pop() + (String) stack.pop();
		System.out.println(s3);
		
		StringBuilder strr = new StringBuilder("Suresh");
		System.out.println(strr.reverse());
		
		StringBuffer strr1 = new StringBuffer("Arun");
		System.out.println(strr1.reverse());
		
	}
	
	 public static String reverseString(String originalString) {
        	
		 	
		 	String reversed="";
		 	Stack<Character> stack = new Stack<>();
	        for (int i = 0; i < originalString.length(); i++) {
	            char ch = originalString.charAt(i);
	            stack.push(ch);
	        }
	        for (int i = 0; i < originalString.length(); i++) {
	            char ch = stack.pop();
	            reversed = reversed + ch;

	        }
	        return reversed;

	    }

}
