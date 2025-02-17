package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.legalPerson;
import entities.normalPeople;
import entities.physicalPerson;

public class aplication {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<normalPeople> list = new ArrayList<>();
		Scanner user = new Scanner(System.in);
		System.out.print("Enter the number of tax payers: ");
		int num = user.nextInt();
		for (int i = 1; i <= num; i++) {
			System.out.print("Individual or company (i/c)? ");
			String opt1 = user.next();
			System.out.print("Name: ");
			String name = user.next();
			System.out.print("Anual income: ");
			double anual = user.nextDouble();
			System.out.print("Health expenditures: ");
			double expenditures = user.nextDouble();

			if (opt1.equalsIgnoreCase("i")) {

				list.add(new physicalPerson(name, anual, expenditures));
			} else {
				System.out.print("Number of employee: ");
				int employee = user.nextInt();
				list.add(new legalPerson(name, anual, employee));
			}
		}
		double soma = 0.0 ;
		System.out.println();
		System.out.println("TAXES PAID");
		for(normalPeople puxa : list) {
			double total = puxa.val();
			System.out.printf("%s: $ %.2f%n",puxa.getname(),total);
			soma += total;
		}
	
		System.out.println();
	    System.out.printf("TOTAL TAXAS: $ %.2f%n",soma);
			
		
        
		user.close();
	}

}
