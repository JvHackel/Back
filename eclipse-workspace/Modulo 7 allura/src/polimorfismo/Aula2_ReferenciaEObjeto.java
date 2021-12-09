package polimorfismo;

class Conta{
	int id;
	public void liga() { }	
	}

class ContaJuri extends Conta{
	String cnpj;
	public void Fecha() { }	
	}

class ContaFisica{
	void fecha() { }
	}


public class Aula2_ReferenciaEObjeto {

	public static void main (String [] args) {
		
		Conta c = new ContaJuri();
		c.id = 500;               // c nao pega o cnpj temos que criar uma nova 
		c.liga();                 // c nao pega o fecha();
		
		ContaJuri marcos = new ContaJuri();
		marcos.cnpj = "09551903471";
		marcos.id = 5;
		
		
	}
}