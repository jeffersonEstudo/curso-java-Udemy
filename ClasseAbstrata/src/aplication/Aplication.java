package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.Circle;
import Entities.Rectangle;
import Entities.Shape;
import Entities.enums.Color;
public class Aplication {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner user = new Scanner(System.in);
		List<Shape> list = new ArrayList<>();
		System.out.println("Enter the number of Shape: ");
		int quan = user.nextInt();
		for (int i = 1; i <= quan; i++) {
			
			System.out.println("Rectangle or Circle (r/c)? ");
			String a = user.next();

			System.out.println("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(user.next());
			if (a.equals("r")) {
				System.out.println("Width: ");
				double width = user.nextDouble();
				System.out.println("Height: ");
				double height = user.nextDouble();
				list.add(new Rectangle(color, width, height));
			}

			else{
				System.out.println("Radius: ");
				double radius = user.nextDouble();
				list.add(new Circle(color, radius));
			}
		}
			
			System.out.println();
			System.out.println("SHAPE AREAS: ");
			for (Shape chama : list) {
				
				System.out.printf(String.format("%.2f%n", chama.area()));
			
			
		}
		user.close();
	}

}
