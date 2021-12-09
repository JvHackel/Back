package polimorfismo;

import java.io.IOException;

interface A {
	public void x();    // todo metodo de uma interface e publico e batrato
}

class B implements A{
	public void x() {
		
	}
	
}
	class Veiculo{
		
		public void liga() throws java.io.IOException {
			System.out.println("Estou ligando");
		}
	}
	class coptero extends Veiculo{
		public void liga() throws java.io.FileNotFoundException {    // herda de IOException
			// aqui foi feito uma sobrecarga - dois metodos mesmo nome e parametros diferentes
			System.out.println("Ligando o coptero");
		}
	}
	
	
	abstract class Droid extends Veiculo{
		public abstract void liga();
	}
	 class HexaDroid extends Droid {
		public void liga() {
			System.out.println("hexa");
		}
	}
	
	 
	 class Fabric{
		 Veiculo fabrica() {
			 return new Veiculo();
		 }
		 
	 }
	 class FabricHexaDroid extends Fabric {
		 
		 Veiculo fabrica() {
			 return new HexaDroid();  // retorno tem que ser do mesmo tipo para compilar
		 }
	 }
	 
	 
	 
	public class Aula1 {
		
		 static void metodo(Veiculo v) throws IOException {
				v.liga();
			}
	public static void main(String[] args) throws java.io.IOException {
		
		Veiculo carro = new Veiculo();
		carro.liga();
		System.out.println();
		coptero alfa = new coptero();
		alfa.liga();          // como subclasse ela herda os metodos da mae mesmo se nao tivesse esse metodo liga ele ia buscar no da classe mae
		
		
		
		// metodo polimorfico 
		
		//metodo(new Hexadroid()); da erro ???
		metodo(new Veiculo());
		//metodo(new Coptero());
		
	}

}
