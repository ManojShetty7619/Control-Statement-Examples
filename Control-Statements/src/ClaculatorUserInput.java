
import java.util.Scanner;

public class ClaculatorUserInput {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter first number");
		int no1 = scanner.nextInt();

		System.out.println("Enter second number");
		int no2 = scanner.nextInt();

		System.out.println("Select symbol (+,-,*,/)");
		String symbol = scanner.next();

		int result;
		switch (symbol) {
		case "+":
			result = no1 + no2;
			System.out.println("Addition of number :" + result);
			break;

		case "-":
			result = no1 - no2;
			System.out.println("Subtraction of number :" + result);
			break;

		case "*":
			result = no1 * no2;
			System.out.println("Multiplication of number :" + result);
			break;

		case "/":
			result = no1 / no2;
			System.out.println("Division of number :" + result);
			break;

		default:
			System.out.println("Invalid Symbol");
			break;

		}

	}
}
