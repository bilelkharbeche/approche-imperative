package fr.algorithmie;

public class TriParSelection {

	public static void main(String[] args) {
		
		int[] array = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8} ;		
		int temp = 0;
		
		for (int i = 0; i < array.length - 1; i++) {			
			for (int j = i+1; j < array.length; j++) {
				if (array[j] < array[i]) {					
					temp = array[j];
					array[j] = array[i];
					array[i] = temp;					
				}
				
			}
			System.out.println(array[i]);
		}

	}

}
