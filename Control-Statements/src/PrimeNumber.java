import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a number");
		int number = scanner.nextInt();
		int temp = 0;
		for (int i = 2; i <= number - 1; i++) {
			if (number % i == 0) {
				temp = temp + 1;
			}
		}
		if (temp > 0) {
			System.out.println("Number " + number + " is not a Prime number");
		} else {
			System.out.println("Number " + number + " is a Prime number");
		}
	}

}
