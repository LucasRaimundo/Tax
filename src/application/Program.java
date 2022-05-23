package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPrayer;

public class Program {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		List<TaxPrayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payer: ");
		byte n = ler.nextByte();
		
		for(int i=1; i<=n;i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company?  (i/c) ");
			char ch = ler.next().charAt(0);
			System.out.print("Name: ");
			String name = ler.next();
			System.out.print("Anual income: ");
			double anualincome = ler.nextDouble();
			if (ch == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = ler.nextDouble();
				list.add(new Individual(name, anualincome, healthExpenditures));
			} else {
				System.out.print("Number of employees: ");
				int numberOfEmployees = ler.nextInt();
				list.add(new Company(name, anualincome, numberOfEmployees));
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		
		for(TaxPrayer tax : list) {
			System.out.println(String.format("%.2f%", tax.tax()));
		}
		
		
		
		
		ler.close();

	}

}
