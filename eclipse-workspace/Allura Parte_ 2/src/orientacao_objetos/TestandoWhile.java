package orientacao_objetos;
import java.util.Scanner;

public class TestandoWhile {

	public class JavaApplication39 {
	    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	     int number,cont = 0, soma = 0;
	     
	  System.out.println("Digite um number inteiro ou 0 para acabar: ");
	    number = in.nextInt();  
	    
	while(number!=0){
	    cont++;
	    soma = number + soma;
	  System.out.print("Digite um number inteiro ou 0 para acabar: ");
	    number = in.nextInt();
	   
	    }
	System.out.println("Fim, foram lidos: "+ cont+" numbers" + " sendo a soma deles: " + soma);  }   }
}