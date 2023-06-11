import java.util.Scanner;

public class GettingUserInput {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);// System.in for input

		System.out.println("Enter a name");
		String name = scanner.next();// for enter the name

		System.out.println("Enter Gender");
		char gender = scanner.next().charAt(0);// to enter the character like M or F

		System.out.println("Enter the age");
		int age = scanner.nextInt();// to enter the integer

		System.out.println("Enter phone number");
		long number = scanner.nextLong();// to enter the long

		System.out.println("Name :" + name);
		System.out.println("Gender :" + gender);
		System.out.println("Age :" + age);
		System.out.println("Phone number :" + number);

	}
}
