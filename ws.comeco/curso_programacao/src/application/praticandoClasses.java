package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Products;


public class praticandoClasses {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner insertion = new Scanner(System.in);
	Products data = new Products();
	
	System.out.println("Enter with Name of Product: ");
	data.name = insertion.nextLine();
	
	System.out.println("Enter with Price of Product: ");
	data.price = insertion.nextDouble();
	
	System.out.println("Enter with quantity of Product: "); 
	data.quantity = insertion.nextInt();
	
	System.out.println(data);
	
    insertion.close();
	}

}
