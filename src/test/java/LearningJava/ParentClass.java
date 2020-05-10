package LearningJava;

public class ParentClass extends ChildClass{
	
	public static void main(String[] args) {
		
		ParentClass parent = new ParentClass();
		parent.parent();
		parent.child();
		
		ChildClass child = new ChildClass();
		
	}
	
	public void parent() {
		System.out.println("Parent Class");
	}

}
