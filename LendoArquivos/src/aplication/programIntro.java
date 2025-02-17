package aplication;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class programIntro {

	public static void main(String[] args) {
		File file = new File("c:\\temp\\in.txt");
        Scanner user = null;
        try {
        	user = new Scanner(file);
        	while (user.hasNextLine()) {
        	 System.out.println(user.nextLine());
        	}
        	
        }
        catch(IOException e) {
        	System.out.println("Error: " + e.getMessage());
        }
        finally {
        	if(user != null) {
        	user.close();
		}
        	}
	}

}
