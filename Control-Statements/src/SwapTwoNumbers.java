
public class SwapTwoNumbers {
	public static void main(String[] args) {
		// swap two numbers using third variable

		int a = 10;
		int b = 20;
		int t = a;// t=10
		a = b;// a=20
		b = t;// b=10
		System.out.println("a :" + a);
		System.out.println("b :" + b);

		// swap two numbers without using third variable
		int x = 30;
		int y = 40;
		x = x + y;// x=70
		y = x - y;// y=30
		x = x - y;// x=40

		System.out.println("x :" + x);
		System.out.println("y :" + y);

	}
}
