package fr.algorithmie;

public class Rotation {

	public static void main(String[] args) {

		int[] array = {5, 8, 1, 20};
		
		int first = array[array.length-1];			
		
		for (int i = array.length -1; i > 0; i--) {		
			
			array[i] = array[i-1];				
		}
		array[0] = first;
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
