import java.util.Scanner;

public class FactorialRecursion {
	static int fact = 1;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a number");
		int number = scanner.nextInt();
		
		FactorialRecursion factorial = new FactorialRecursion();
		factorial.calculateFactorial(number);
		System.out.println("Factorial of number " + number + " is : " + fact);
	}

	void calculateFactorial(int number) {
		if (number >= 1) {
			fact = fact * number;
			calculateFactorial(number - 1);
		}

	}

}
