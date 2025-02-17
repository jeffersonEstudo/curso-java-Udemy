package aplication;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entities.ImportedProduct;
import Entities.Product;
import Entities.UsedProduct;

public class Aplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> list = new ArrayList<>();
		Scanner user = new Scanner(System.in);
		System.out.print("Number of product:");
		int num = user.nextInt();
		for (int i = 1; i <= num; i++) {
			System.out.print("Commom or Imported, Used Product? c/i/u: ");
			String opt1 = user.next();
			System.out.println("Product #" + i);
			System.out.print("Name of product " + i + ": ");
			String name = user.next();
			System.out.print("Price of product " + i + ": ");
			double price = user.nextDouble();

			if (opt1.equals("i")) {
				System.out.print("Whay this taxa? ");
				double customsFee = user.nextDouble();
				list.add(new ImportedProduct(name, price, customsFee));
			}
			if (opt1.equals("u")) {
				System.out.println("Manufacture date (DD/MM/YYYY): ");
				LocalDate data = LocalDate.parse(user.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				Product puxa = new UsedProduct(name, price, data);
				list.add(puxa);
			}

			if (opt1.equals("c")) {
				Product puxa = new Product(name, price);
				list.add(puxa);
			}

			if (i == num) {
				System.out.println();
				System.out.println("Products: ");
				for (Product puxa : list) {
					System.out.println(puxa.priceTag());
				}
				
			}user.close();
		}
	}

}
