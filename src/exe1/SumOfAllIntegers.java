package exe1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class SumOfAllIntegers {

	public static void main(String[] args) {

		int num,sum=0;
		String str;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the integers with one spaced gap : ");

		str = input.nextLine();
		StringTokenizer st = new StringTokenizer(str," ");
		System.out.print("Entered Numbers are : ");

		while(st.hasMoreTokens()) {
			String empty_str = st.nextToken();
			num = Integer.parseInt(empty_str);
			System.out.print(num+" ");
			sum+=num;
		}

		System.out.println("\nSum of given integers is : "+sum);
		input.close();
	}

}