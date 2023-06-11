import java.time.LocalDate;
import java.time.Period;

public class DateFormat {
	public static void main(String[] args) {
		long balance = 10000;
		int balanceAmount = (int) balance;

		String startDate = "2018-01-01";
		String promotionDate = "2019-02-01";

		LocalDate sdate = LocalDate.parse(startDate);
		LocalDate pdate = LocalDate.parse(promotionDate);

		LocalDate ssdate = LocalDate.of(sdate.getYear(), sdate.getMonth(), sdate.getDayOfMonth());
		LocalDate ppdate = LocalDate.of(pdate.getYear(), pdate.getMonth(), pdate.getDayOfMonth());

		Period period = Period.between(ssdate, ppdate);

		System.out.println("Difference : " + period.getYears() + " Years " + period.getMonths() + " months "
				+ period.getDays() + " days ");

		int yearToMonth = period.getYears() * 12;
		int totalMonths = period.getMonths() + yearToMonth;
		System.out.println("total month :" + totalMonths);

		int forEverysixMonth = totalMonths / 6;
		System.out.println(forEverysixMonth);

		LocalDate now = LocalDate.now();
		System.out.println("present date :" + now);
		
		float PrincipalAmount = balanceAmount;
		float Rate = 8;
		float Time = forEverysixMonth;
		float simpleInterest = (PrincipalAmount * Rate * Time) / 100;
		System.out.println("Interst :" + simpleInterest);

		float remainingBalance = balanceAmount + simpleInterest;
		System.out.println("Remaining balance :" + remainingBalance);

	}
}
