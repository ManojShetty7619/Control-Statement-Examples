
public class Calculator {

	public static void main(String[] args) {
		int no1 = 10, no2 = 20, result;

		String symbol = "+";//-,+,/,*,.....etc

		switch (symbol) {
		case "+":
			result = no1 + no2;
			System.out.println(result);
			break;

		case "*":
			result = no1 * no2;
			System.out.println(result);
			break;
		case "/":
			result = no1 / no2;
			System.out.println(result);
			break;
		case "-":
			result = no1 - no2;
			System.out.println(result);
			break;
		default:
			System.out.println("Invalid Symbol");

		}

	}
}
