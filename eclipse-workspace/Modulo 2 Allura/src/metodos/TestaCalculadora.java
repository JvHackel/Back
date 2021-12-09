package metodos;

public class TestaCalculadora {
	
	public static void main (String [] args) {
		
		Calculadora calc = new Calculadora();
		
		System.out.println(calc.Soma("Marmota 1",3,5));
		System.out.println(calc.Soma("Marmota 2",3,5, 6,7,8,9,10,5,2,4,78));
	}
}
    class Calculadora{
    	  
    	  public int Soma(String nome, int... numbers) {    // como soma um varargs(array) varios vamos criar um for 
    		  int soma = 0;
    		  for(int i = 0; i < numbers.length; i++) {
    			  soma += numbers[i];
    		  }
			return soma;
    	  }  
      }