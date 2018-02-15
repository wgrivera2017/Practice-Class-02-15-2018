
public class Even {

	public static void main(String[] args) {

		int a = 3;
		boolean z = evenNumbers(a);
		System.out.println(z);

		int b = 6;
		boolean y = evenNumbers(b);
		System.out.println(y);

		int c = 7;
		boolean x = evenNumbers(c);
		System.out.println(x);

		int d = 2;
		boolean w = evenNumbers(d);
		System.out.println(w);

	}

	public static boolean evenNumbers(int num1) {

		if (num1 % 2 == 0) {
			return true;
		}
		else {
			return false;

		}
	}
}
