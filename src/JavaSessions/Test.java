package JavaSessions;

public class Test {

	public static void main(String[] args) {

		Test obj = new Test();
		obj.swapTowValues();
		obj.swapTowValuesWithTemp();

	}

	public void swapTowValues() {
		int x = 10;
		int y = 20;
		System.out.println("Before Swap:" + x + " " + y);
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("After Swap:" + x + " " + y);
	}

	public void swapTowValuesWithTemp() {
		int temp;
		int x = 10;
		int y = 20;
		System.out.println("Before Swap:" + x + " " + y);
		temp = x;
		x = y;
		y = temp;
		System.out.println("After Swap:" + x + " " + y);
	}

}
