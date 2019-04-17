package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int max = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Veuillez saisir un nombre");
			int valeur = scanner.nextInt();	
			if (valeur > max){
				max = valeur;
			}			
		}
		System.out.println(max);
	}

}
