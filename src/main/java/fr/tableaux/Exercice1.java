package fr.tableaux;

public class Exercice1 {

	public static void main(String[] args) {
		
		int[] tableau = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		System.out.println(tableau[0]);
		System.out.println(tableau[9]);
		System.out.println(tableau.length);
		System.out.println(tableau[4]); // L'entier 5 est situé à l'index 4
		//System.out.println(tableau[10]); Erreur car aucune valeur dans l'index 10. Les index vont de 0 à 9
		tableau[4] = 8;
		System.out.println(tableau[4]);
	}

}
