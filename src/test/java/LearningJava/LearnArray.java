package LearningJava;

public class LearnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			  int a[] = new int[6]; //Array declaration and Creation. 6 is length of array.
			  LearnArray obj = new LearnArray();
			  obj.array();
			  a[0] = 10; //initialize 1st array element
			  a[1] = 12; //initialize 2nd array element
			  a[2] = 48; //initialize 3rd array element
			  a[3] = 17; //initialize 4th array element
			  a[4] = 5;  //initialize 5th array element
			  a[5] = 49; //initialize 6th array element
			  
			  for(int i=0; i<a.length; i++){
			  System.out.println(a[i]);
			  }
			  
	}
	public void array()
	{
	  
	  String str[][] = new String[3][2]; //3 rows, 2 columns
	  str[0][0]="User1";
	  str[0][1]="Password1";
	  str[1][0]="User2";
	  str[1][1]="Password2";
	  str[2][0]="User3";
	  str[2][1]="Password3";
  
	  for(int i=0; i<str.length; i++){//This for loop will be totally executed 3 times.
		System.out.println(str.length);
	  for(int j=0; j<str[i].length; j++){//This for loop will be executed for 2 time on every iteration.
	    System.out.println(str[i][j]);
	   
	   }
	
	
	  
	  }
	 
	}
}
	 
