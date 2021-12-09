package metodoExcecao;

class conta{
	
	double saldo = 100;
	void saca(double qtd) {
		
	}
}

public class TestaTrataException2 {

	public static void metodo1() {
		
		System.out.println("Primeiro antes");
		try {
			metodo2();                            
			System.out.println("Primeiro depois");  // 
		}catch(NullPointerException e){
			System.out.println("Tratei");
		}
		System.out.println("fim");
	}
	public static void metodo2() {
		String s = null;
		System.out.println("Segundo antes");
		
		s.length();
		System.out.println("Segundo depois");
	}

		public static void main (String [] args) {
			metodo1();
			
		}

}
