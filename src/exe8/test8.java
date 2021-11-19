package exe8;

import java.util.Scanner;

public class test8 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = input.nextLine();
		PositiveString ps = new PositiveString();
		if(ps.check(str)) {
			System.out.println(str+" is a Positive String");
		}else {
			System.out.println(str+" is not a Positive String");
		}
	}

}