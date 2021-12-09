package objetosEConstrutores;



	 class Mae {   // Uma calsse filha sempre tem que acessar o contrutor da classe mae 
		 public Mae() {
		System.out.println("construindo parte mae");
	}
}
	  class Filha extends Mae{
		Filha(String nome) {
			      // implicitamente tem um super(); aqui
			System.out.println("construindo parte filha");
		}
	}
	
	 public class TestaConstrutores {
	public static void main(String[] args) {
		
		Filha filha = new Filha("Teste");
	}

}

