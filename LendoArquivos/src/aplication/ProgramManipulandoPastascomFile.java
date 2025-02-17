package aplication;

import java.io.File;
import java.util.Scanner;

public class ProgramManipulandoPastascomFile {

	public static void main(String[] args) {
		
		Scanner user = new Scanner(System.in);
		System.out.println("Enter a folder path: ");
		String strPath = user.next();
		
		
		File path = new File(strPath);
		
		File[] folders = path.listFiles(File::isDirectory);	
		System.out.println("FOLDERS: ");
		for(File folder : folders) {
			System.out.println(folder);
		}
		
		File[] files = path.listFiles(File::isFile);
		System.out.println("Files: ");
		for(File file : files) {
			System.out.println(file);
		}
		
		Boolean success = new File(strPath + "\\subdir").mkdir();
		System.out.println("Directory created successfully: " + success);
      user.close();
	}

}
