package exe4;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the int value : ");
		int number = input.nextInt();
		
		shiftDigits sd = new shiftDigits();
		System.out.println("Modified Number is : "+sd.modifyNumber(number));
		
	}

}