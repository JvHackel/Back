package arrays;

import operadores.Strings;

public class Arrays_Referencia {

	public static void main(Strings [] args ) {
		
		Cliente [] marmota = new Cliente[10];
		System.out.println(marmota[0].name);  // null 
		int[] numeros =  new int[]{1,2,5,7,5};
		System.out.println(numeros);
		
	}
}

  class Cliente{
	 
	 String name;
 }