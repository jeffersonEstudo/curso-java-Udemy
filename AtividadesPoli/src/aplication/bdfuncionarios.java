package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class bdfuncionarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner user = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();

		System.out.print("Enter the number of employees: ");
		int num = user.nextInt();

		
		for (int i = 1; i <= num; i++) {
			
			System.out.print("Employee #" + i + " data:");
            System.out.println();
            System.out.print("Outsourced? (y/n): ");
			String cond = user.next();
			System.out.print("Digite your name: ");
			String a = user.next();
		
			System.out.print("Hours trabalhadas: ");
			int b = user.nextInt();
			
			System.out.print("Value per Hours: ");
			double c = user.nextDouble();

			if (cond.equalsIgnoreCase("y")) {
				System.out.print("Additional Charge: ");
				double d = user.nextDouble();
				Employee puxa = new OutsourcedEmployee(a, b, c, d);
				list.add(puxa);
		       }
			else{Employee puxa = new Employee(a, b, c);
			    list.add(puxa);
				
				}
			if(i == num) {
			System.out.println();
			System.out.println("PAYMENTS:");
			for (Employee puxa : list) {
				System.out.println(puxa.getName() + " - $ " + puxa.payment());
			}}
			
		}user.close();
	}
	
}
