package exe9;

import java.time.LocalDate;
import java.time.Period;

class DateCalculator{
	
	private int years;
	private int months;
	private int days;

	public void DateCalculator() {
		this.days = days;
		this.months = months;
		this.years = years;
	}
	
	public void DateCalculator(int days,int months,int years) {
		this.days = days;
		this.months = months;
		this.years = years;
	}
	
	public void Duration(int days,int months,int years) {
		
		LocalDate GivenDate = LocalDate.of(years, months, days);
		LocalDate currentDate = LocalDate.now();
		
		Period diff = Period.between(GivenDate, currentDate);
		
		System.out.println("Duration in Days : "+diff.getDays());
		System.out.println("Duration in Months : "+diff.getMonths());
		System.out.println("Duration in Years : "+diff.getYears());
	}
}