package learningjava;

public class LocalAndGlobalVars {
	
	String name = "Tom";
	int age = 25;

	public static void main(String[] args) {

		LocalAndGlobalVars obj = new LocalAndGlobalVars();
		System.out.println(obj.name);
		System.out.println(obj.age);
		int k =10;
		obj.sum();
		
	}
	
	
	public void sum(){
		int i = 10; //local var
		age=30;
		name="AAA";
		System.out.println(age);
		System.out.println(name);
		//System.out.println(k);
	}
	
	public void sendMail(){
		int j = 20;
	}

}
