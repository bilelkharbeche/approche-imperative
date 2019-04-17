package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Veuillez saisir un nombre");
		int valeur = scanner.nextInt();
		int somme = valeur;
		
		for (int i = 0; i < valeur; i++) {
			somme = somme + i;			
		}
		System.out.println(somme);
	}

}
