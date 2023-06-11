import java.util.Scanner;

public class FactorialRecursion2 {
	 int total = 1;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a number");
		int number = scanner.nextInt();

		FactorialRecursion2 factorial = new FactorialRecursion2();
		int fact;
		fact = factorial.calculateFact(number);
		System.out.println("Factorial of number " + number + " is : " + fact);
	}

	int calculateFact(int number) {
		if (number >= 1) {
			//return number * calculateFact(number - 1);
			total = total * number;
			calculateFact(number - 1);
		}
		return total;

	}

}
