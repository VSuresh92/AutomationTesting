package learningjava;

public class LearnConstructor {

	int id;
	String name;
	int age;
	
	//Default Constructor
	public LearnConstructor()
	{
		
	}
	
	//OverLoading 
	public LearnConstructor(int i,String j) {
		// TODO Auto-generated constructor stub
		
		id=i;
		name=j;
		
	}
	//OverLoading
	public LearnConstructor(int i,String j,int k) {
		// TODO Auto-generated constructor stub
		
		id=i;
		name=j;
		age=k;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Default Construcor
		LearnConstructor obj = new LearnConstructor();
		//Parameterised constructor
		LearnConstructor obj1= new LearnConstructor(339, "Suresh");
		LearnConstructor obj2= new LearnConstructor(340,"Bharani",30);
		obj.student();
		obj1.student();
		obj2.student1();
		
	}
	
	public void student()
	{	
		System.out.println(id+" "+name);
	}
	public void student1()
	{	
		System.out.println(id+" "+name+" "+age);
	}

}
