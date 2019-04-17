package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class InteractifPlusMoins {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int count = 1;
		
		Random random = new Random();
		int rnd = random.nextInt(100) + 1;
		//System.out.println(rnd);
		System.out.println("Veuillez choisir un nombre");
		int valeur = scanner.nextInt();
		
		while (!(valeur == rnd)){
			if (valeur < rnd){
				System.out.println("Votre nombre est inférieur au nombre à trouver");
			}
			else{
				System.out.println("Votre nombre est supérieur au nombre à trouver");
			}
			valeur = scanner.nextInt();
			count = count + 1;
		}
		System.out.println("Félicitation vous avez trouvé en " + count + " coups");

	}

}
