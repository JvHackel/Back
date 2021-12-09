package tryCatch;

public class Exercicios {
     // consertei inicializando a variavel
	public static void main(String[] args) {
		 String nome = "A";         
	        try {
	            nome.toLowerCase();
	            System.out.println("a");
	        } catch(NullPointerException ex) {
	            System.out.println("b");
	        }
	        System.out.println("c");

	}

}
