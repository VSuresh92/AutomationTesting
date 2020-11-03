package learningjava;

public class NumbersLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findArmstrong();
	}

	public static void findArmstrong() {

		int c = 0, a, temp;
		int n = 153;// It is the number to check armstrong

		temp = n;

		while (n > 0) {
			a = n % 10; // 3
			n = n / 10; // 15
			c = c + (a * a * a); // 0+(3*3*3) == 27 + (125)
		}

		if (temp == c) {
			System.out.println("Given number is an armstrong number");
		}

		else {
			System.out.println("Given number is Not an armstrong number");
		}
	}
}
