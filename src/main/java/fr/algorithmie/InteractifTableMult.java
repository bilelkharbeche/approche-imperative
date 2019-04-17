package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Veuillez saisir une valeur comprise entre 1 et 10");
		int valeur = scanner.nextInt();

		while (!(valeur > 0 && valeur <= 10)) {
			System.out.println("Veuillez saisir une valeur comprise entre 1 et 10");
			valeur = scanner.nextInt();
		}
		for (int i = 1; i < 11; i++) {
			System.out.println(valeur + "*" + i + "=" + valeur*i);			
		}
		
	}

}
