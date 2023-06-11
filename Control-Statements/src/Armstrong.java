import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a number");
		int number = scanner.nextInt();
		int temp1 = number;
		int temp2 = number;
		// find the length
		int lenght = 0;
		while (temp1 != 0) {
			temp1 = temp1 / 10;
			lenght = lenght + 1;
		}
		System.out.println("lenght of the number is : " + lenght);
		// check for Armstrong

		int reminder;
		int armStrong = 0;

		while (temp2 != 0) {
			reminder = temp2 % 10;
			int multiply = 1;
			for (int i = 1; i <= lenght; i++) {// multiply a digit length of the number times
				multiply = multiply * reminder;// multiply and get the total value
			}
			armStrong = armStrong + multiply;// add the multiply of each number
			temp2 = temp2 / 10;// do it for next digit

		}
		System.out.println("Total value of checked number is : " + armStrong);
		if (number == armStrong) {
			System.out.println("the number is Armstrong");
		} else {
			System.out.println("the number is not Armstrong");
		}
	}
}
