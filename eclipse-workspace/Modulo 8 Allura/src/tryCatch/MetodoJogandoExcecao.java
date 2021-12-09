package tryCatch;

public class MetodoJogandoExcecao {

	
	public static void metodo1() {
		System.out.println("Metodo 1 antes ");
		metodo2();
		System.out.println("Metodo 1 depois ");
	}
	public static void metodo2() {
		String s = null;
		System.out.println("Metodo 2 antes ");
		s.length();
		System.out.println("Metodo 2 depois ");
	}
	
	
	
	public static void main(String[] args) {
		metodo1();

	}

}