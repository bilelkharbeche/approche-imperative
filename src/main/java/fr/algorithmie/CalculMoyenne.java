package fr.algorithmie;

public class CalculMoyenne {

	public static void main(String[] args) {

		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		double j = 0;
		
		for (int i = 0; i < array.length; i++) {
			j = (j + array[i]);
		}
		System.out.println(j/array.length);

	}

}
