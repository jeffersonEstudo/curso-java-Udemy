package aplication;

import java.io.File;
import java.util.Scanner;

public class InfoPastas {

	public static void main(String[] args) {
		Scanner user =new Scanner(System.in);
		
		System.out.println("Enter a file path: ");
		String strPath = user.nextLine();
		
		File path = new File(strPath);
       
		System.out.println("getName: " + path.getName());
		System.out.println("getParent: "+ path.getParent());
		System.out.println("getPath:"+ path.getPath());
		user.close();
	}

}
