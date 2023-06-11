import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = scanner.next();
		int length = str.length();
		String reverse = "";
		for (int i = length - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		System.out.println("Reverse of a string : " + reverse);
	}
}
