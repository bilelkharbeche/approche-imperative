package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in) ;
		
		System.out.println("Veuillez saisir un nombre compris entre 1 et 10");
		int valeur = scanner.nextInt() ;
		
		while (!(valeur > 0 && valeur <= 10)){
			System.out.println("Veuillez saisir un nombre compris entre 1 et 10");
			valeur = scanner.nextInt();
		}
		System.out.println("Le nombre entré est le " + valeur);

	}

}
