package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class Interfactif21Batons {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Random random = new Random()
				;
		int batons = 21; 

		System.out.println("Veuillez choisir le nombre de bâtons que vous souhaitez retirer (1, 2 ou 3)");
		int value = scanner.nextInt();

		while (batons > 1){
			
			if (value == 1){
				batons = batons -1;
				System.out.println("Il reste " + batons + " batons");
			}
			else if (value == 2){
				batons = batons -2;
				System.out.println("Il reste " + batons + " batons");
			}
			else if (value == 3){
				batons = batons -3;
				System.out.println("Il reste " + batons + " batons");
			}
			else if (value < 1 || value > 3){
				System.out.println("Valeur invalide, Fin de partie");
				break;
			}

			//System.out.println("Il reste " + batons + " batons");
			int rnd = random.nextInt(3) + 1;

			if (rnd == 1){
				if (batons > 1){
					batons = batons -1;
					System.out.println("L'odinateur a retiré 1 baton");
					System.out.println("Il reste " + batons + " batons");
					System.out.println("Veuillez choisir le nombre de bâtons que vous souhaitez retirer (1, 2 ou 3)");	
					value = scanner.nextInt();
				}
				System.out.println("L'ordinateur a perdu");
			}
			else if (rnd == 2){
				if (batons > 1){								
					batons = batons -2;
					System.out.println("L'ordinateur a retiré 2 batons");
					System.out.println("Il reste " + batons + " batons");
					System.out.println("Veuillez choisir le nombre de bâtons que vous souhaitez retirer (1, 2 ou 3)");	
					value = scanner.nextInt();
				}				
				System.out.println("L'ordinateur a perdu");				
			}
			else if (rnd == 3){
				if (batons > 1){			
					batons = batons - 3;
					System.out.println("L'ordinateur a retiré 3 batons");
					System.out.println("Il reste " + batons + " batons");
					System.out.println("Veuillez choisir le nombre de bâtons que vous souhaitez retirer (1, 2 ou 3)");	
					value = scanner.nextInt();
				}				
				System.out.println("L'ordinateur a perdu");				
			}			
		}		

	}

}
