import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a number");
		int number = scanner.nextInt();

		int reminder;
		int reverse = 0;

		while (number != 0) {
			reminder = number % 10;
			reverse = reverse * 10 + reminder;
			number = number / 10;
		}
		System.out.println("reverse of a number :" + reverse);
	}
}
