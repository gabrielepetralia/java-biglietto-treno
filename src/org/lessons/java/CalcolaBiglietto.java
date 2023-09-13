package org.lessons.java;

import java.util.Scanner;

public class CalcolaBiglietto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Calcola Biglietto");
		
		System.out.println("==================");
		
		System.out.print("Quanti km vuoi percorrere: ");
		int km = sc.nextInt();
		
		System.out.print("Inserisci la tua età: ");
		int age = sc.nextInt();
		
		sc.close();
		
		float price = 0.21F * km;
		
		if(age < 18) {
			price = price - (price / 100 * 20);
		} else if(age > 65) {
			price = price - (price / 100 * 40);
		}
		
		String formattedPrice = String.format("%.02f", price);
		
		System.out.println("==================");	
		
		System.out.println("Il prezzo del biglietto è: €" + formattedPrice);
	}
}
