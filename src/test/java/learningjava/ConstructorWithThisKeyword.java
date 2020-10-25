package learningjava;

public class ConstructorWithThisKeyword extends ConstructorConcept{
	
	//class vars
	String name;
	int age;
	
	public ConstructorWithThisKeyword(){
		System.out.println("Parent");
		
	}
	
	public ConstructorWithThisKeyword(String name, int age){
		this.name = name;
		this.age = age;
		
		System.out.println(name);
		System.out.println(age);
		
	}
	
	
	
	public static void main(String[] args) {
//		ConstructorWithThisKeyword obj = new ConstructorWithThisKeyword("Tom",30);
//		ConstructorConcept obj1 = new ConstructorConcept();
		ConstructorWithThisKeyword obj = new ConstructorWithThisKeyword();
	}

}
