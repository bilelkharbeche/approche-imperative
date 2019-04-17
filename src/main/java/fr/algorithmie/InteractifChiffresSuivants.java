package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in) ;
		
		System.out.println("Veuillez saisir un nombre");
		int valeur = scanner.nextInt() ;
		
		for (int i = 1; i < 11; i++) {
			System.out.println(valeur + i);			
		}
	}

}
