package exe9;

import java.util.Scanner;

public class test9 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Day : ");
		int day = input.nextInt();
		System.out.print("Enter the Month : ");
		int month = input.nextInt();
		System.out.print("Enter the year : ");
		int year = input.nextInt();
		DateCalculator dc = new DateCalculator();
		dc.Duration(day,month,year);
	}

}