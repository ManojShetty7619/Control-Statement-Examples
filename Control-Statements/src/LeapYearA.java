
public class LeapYearA {
	public static void main(String[] args) {
		int year = 2001;
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				
				if(year%400==0) {
					System.out.println(year + " is not a Leap year");
				}
				else {
					System.out.println(year + " is a Leap year");
				}

			} 
			else {
				System.out.println(year + " is a Leap year");

			}

		}
		else {
			System.out.println(year + " is not a Leap year");
		}
	}

}
