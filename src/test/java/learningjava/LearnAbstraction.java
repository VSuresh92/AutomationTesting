package learningjava;

abstract class Abstraction

{

	void add() {
		System.out.println("Normal Method");
	}

	Abstraction() {
		System.out.println("Abstract Method");
	}

	abstract void run();

	abstract void walk();

	abstract void fast();

	abstract void slow();

}

class LearnAbstraction1 extends Abstraction {

	void run() {
		System.out.println("running safely..");
	}

	void walk() {
		System.out.println("walking safely..");
	}

	@Override
	void fast() {
		// TODO Auto-generated method stub

	}

	@Override
	void slow() {
		// TODO Auto-generated method stub

	}
}

class LearnAbstraction2 extends Abstraction {
	void run() {
		System.out.println("running slowly..");

	}

	@Override
	void walk() {
		// TODO Auto-generated method stub

	}

	@Override
	void fast() {
		// TODO Auto-generated method stub

	}

	@Override
	void slow() {
		// TODO Auto-generated method stub

	}
}

class LearnAbstraction extends LearnEncapsulation {
	public static void main(String args[]) {
		Abstraction ab = new LearnAbstraction1();
		ab.run();
		ab.add();
		Abstraction bc = new LearnAbstraction2();
		bc.run();
		LearnEncapsulation a = new LearnEncapsulation();
		a.setNameArg("MSC");
		System.out.println(a.getName());

	}
}
