import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scanner.nextInt();
		int reminder;
		int reverse = 0;
		int temp = number;

		while (number != 0) {
			reminder = number % 10;
			reverse = reverse * 10 + reminder;
			number = number / 10;
		}
		System.out.println("Reverse of number is : " + reverse);
		if (reverse == temp) {
			System.out.println("Entered number is palindrome");
		} else {
			System.out.println("Entered number is not palindrome");
		}

		System.out.println("enter a String");
		String str = scanner.next();
		int length = str.length();
		String reverseString = "";
		String originalString = str;
		for (int i = length - 1; i >= 0; i--) {
			reverseString = reverseString + str.charAt(i);
		}
		System.out.println("Reverse of string is : " + reverseString);
		if (reverseString.equals(originalString)) {
			System.out.println("Entered string is palindrome");
		} else {
			System.out.println("Entered string is not palindrome");
		}

	}

}
