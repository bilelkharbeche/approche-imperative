package fr.tableaux;

public class Exercice2 {

	public static void main(String[] args) {
		
		int[][] tableau = {{0, 1, 2},{5, 6, 7, 8, 9}};
		int a = tableau.length - 1;
		int b = tableau[a][tableau[a].length-1];
		
		
		
		System.out.println(tableau.length);
		System.out.println(tableau[0].length);
		System.out.println(tableau[1].length);
		System.out.println(tableau[0][0]);
		System.out.println(b);

	}

}
