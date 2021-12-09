package tryCatch;

public class TestaTrataException {

	public static void main(String[] args) {
		
		String name = null;
		
		try {
			name.toUpperCase();          // trecho que pode gerar um erro na execução.
		} catch(NullPointerException ex) {     // catch ( Throwable a ) {
			System.out.println("Essa foi a excecao");   
			
			
			// apos o catch ocorre o tratamento para o possível erro de execução.
		}
		
		try {
			name.toUpperCase();        
			new java.io.FileInputStream("a.txt");     // aqui foi explicito por isso o catch pegou
		} catch(java.io.IOException ex) {     
			System.out.println("Essa foi a excecao");   
			
			
			
		}

	}

}
