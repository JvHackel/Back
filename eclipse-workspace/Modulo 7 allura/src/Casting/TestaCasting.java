package Casting;

class Veiculo{ }
class Moto extends Veiculo { }
class Carro extends Veiculo { }


public class TestaCasting {
	public static void main(String[] args) {
		Veiculo meu = new Carro();
		Moto minha = (Moto) meu;
		
		Veiculo chat = new Carro();
		Moto bzeu = (Moto) chat;
		
		Carro c = new Carro();   // Moto m2 = (Moto) c; nao compila pois os dois extends de Veiculo e nao um do outro
		
		
		
		
	}

}
