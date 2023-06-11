import java.util.Scanner;

public class Tables {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the Table number");
		int number = scanner.nextInt();
		System.out.println("Table of " + number + " is :");
		int total;
		for (int i = 1; i <= 10; i++) {
			total = number * i;
			System.out.println(number + " * " + i + " = " + total);
		}

	}

}
