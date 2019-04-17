package fr.algorithmie;

public class TriABulle {

	public static void main(String[] args) {
		
		int[] array = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8} ;
		int temp = 0;
		boolean perm = true;
		
		while (perm == true) {
			perm = false;
			
			for (int i = 0; i < array.length -1; i++) {
				if (array[i] > array[i+1]){
					temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;	
					perm = true;
				}
				
			}
			
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}

}
