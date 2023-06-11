import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a number");
		int number = scanner.nextInt();

		long factorial = 1;

		for (int i = 1; i <= number; i++) // increment order multiply
		// for(int i=number;i>=1;i--) decrement order multiply
		{
			factorial = factorial * i;
		}
		System.out.println("Factorial of number " + number + " is : " + factorial);
	}

}
