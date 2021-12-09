package arrays;

import operadores.Strings;

public class Arrays {

	public static void main(Strings [] args ) {
	
	 int marmota [] = {5,6,7,8};
     
     System.out.println(marmota.length);
     for(int i = 0; i < marmota.length; i++) {
     	System.out.println("O valor da marmota na posicao " + (i + 1) + " foi de: "+ marmota[i]);
     }
  }
}