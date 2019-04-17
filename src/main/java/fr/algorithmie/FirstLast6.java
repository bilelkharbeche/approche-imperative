package fr.algorithmie;

public class FirstLast6 {

	public static void main(String[] args) {
		
		int[] array = {2, 8, 3, 10, 6};			
		boolean test = false;		
					
			if (array.length > 0 && (array[0] == 6 || array[array.length -1] == 6)) {
				test = true;				
			}
			else{
				test = false;
			}
			System.out.println(test);		
	}

}
