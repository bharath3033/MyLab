package exe3;

import java.util.Scanner;

public class test {
public static void main(String[] args) {
		
		String stringInput;
		Scanner input = new Scanner(System.in);
		ConvertAlphabets c = new ConvertAlphabets();
		
		System.out.print("Enter the String value : ");
		stringInput = input.nextLine();
		System.out.println("Before altering String : "+stringInput);
		System.out.println("After altering String : "+c.alterString(stringInput));
	}

}
