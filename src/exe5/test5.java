package exe5;

import java.io.IOException;
import java.util.Scanner;

public class test5 {
    public static void main(String[] args) throws IOException {
        
    	Scanner sc = new Scanner(System.in);   
    	System.out.print("Enter the file path : ");
    	String path = sc.nextLine();
    	FileReader fr = new FileReader();
    	fr.displayFileData(path);
    }
}