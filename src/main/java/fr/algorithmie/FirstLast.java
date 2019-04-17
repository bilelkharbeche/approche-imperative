package fr.algorithmie;

public class FirstLast {

	public static void main(String[] args) {
		
		int[] array = {5, 2, 8, 11};
		boolean test = false;
		
		if (array.length >= 1 && (array[0] == array[array.length - 1])){
			test = true;			
		}
		else{
			test = false;
		}
		System.out.println(test);
		

	}

}
