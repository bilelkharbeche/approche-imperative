package fr.algorithmie;

import java.util.Scanner;

public class InteractifFibonacci {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int p = 1;
		int pp = 0;
		int somme = 0;
		
		System.out.println("Veuillez choisir un nombre pour lequel vous souhaitez connaitre la suite de Fibonacci");
		int valeur = scanner.nextInt();
		
		for (int i = 0; i < valeur; i++) {
			somme = p + pp;
			pp = p;
			p = somme;	
			System.out.println(somme);
		}	
	}

}
