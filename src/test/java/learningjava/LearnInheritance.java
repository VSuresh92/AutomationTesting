package learningjava;

public class LearnInheritance extends ParentClass {

	public static void main(String args[]) {

		LearnInheritance li = new LearnInheritance();
		li.sample();
		li.parent();
		li.child();

		ParentClass parent = new ParentClass();
		parent.parent();
		parent.child();

		ChildClass child = new ChildClass();
		child.child();

		ParentClass sub = new LearnInheritance();
		sub.child();
		sub.parent();

		ChildClass ch = new LearnInheritance();
		ch.child();

	}

	public void sample() {
		System.out.println("Inheritance Method");
	}

}
