package exe2;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		
		String str;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the String value : ");
		str = input.nextLine();
		MirrorImage mi = new MirrorImage();
		
		System.out.println("User Entered String is  : "+str);
		System.out.println("Mirror Imaged String is : "+mi.getImage(str));
	}

}