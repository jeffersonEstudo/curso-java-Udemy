package AplicationClassAbstratas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class ClassesAbstratas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Account> list = new ArrayList<>();
		list.add(new SavingsAccount(1001, "Maria", 500.0, 0.01));
		list.add(new BusinessAccount(1002, "Bob", 1000.0, 500.0));
		list.add(new SavingsAccount(1003, "Suavó", 300.0, 0.01));
		list.add(new BusinessAccount(1004, "Nossavó", 500.0, 400.0));
		double sum = 0.0;
		for (Account acc : list) {
			sum += acc.getBalance();

		}
		System.out.printf("Total: %.2f", sum);
		System.out.println();
		for (Account acc : list) {
				acc.deposit(10.0);}
		for(Account acc : list) {
			System.out.printf("Update balance for account %d: %.2f%n", acc.getNumber(),acc.getBalance());
		}
		
	}

}
