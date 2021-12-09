package banco_Alura;

public class Conta {

	private double saldo;
	private int agencia;
	private int numero;
	protected Cliente titular;   // Aqui antes era String virou Cliente pois vai estar ligando uma classe na outra 
	private static int cont = 0;    // para saber o total de contas que foram criadas ai ele conta todda vez que damos new
	
	public Conta(int agencia, int numero) {
		// Perceba que Conta.cont funciona pois e um atributo da classe e Conta.saldo e de uma determinada conta
		Conta.cont++;
		System.out.println("O total de contas e " + Conta.cont);
		this.saldo = saldo;   // se colocar this.saldo = 100; vai inicializar com 100 seria o mesmo de que colocar : double saldo =100
		this.agencia = agencia;
		this.numero = numero;
		this.titular = titular;
	}

	public Conta() {  // Construtor padrao - nao foi gerado automaticamnete
	}
	
	public void deposita(double valor) {
		
		this.saldo +=  valor;  //  this.saldo = this.saldo + valor;
		// toda conta vai ter um saldo mais nao vai ter um valor.
		//Ai faz isso para fixar a cada conta que for adcionada pegar o valor do saldo dela
	}
	public boolean sacar (double valor) { 
		
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		else {      // o return ja freia a condicional logo esse else e opcional
			return false;
		}
	}
	
	public boolean transferencia(double valor, Conta destino) {  // nao precisa colocar Conta destino pois o this faz a refrencia
		
		if(this.saldo >= valor) {
			this.saldo -= valor;
			
			//destino.saldo += valor; ou destino.saldo = destino.saldo + valor; ou destino.deposita(valor);
			// poderiamos usar o sacar tambem: 
			
			destino.sacar(valor);
			return true;
		}
		      // o return ja freia a condicional logo esse else e opcional
			return false; 
		}
	public double getSaldo() {   // nao foi criado automaticamente
		return this.saldo;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <=0) {
			System.out.println("Nao pode ");
			return ;
		}
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if (numero <=0) {
			System.out.println("Nao pode ");
			return ;
		}
		this.numero = numero;
	}

	public Cliente getTitular() {
		return this.titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public static int getCont() {  // aqui vai mostrar a quantidade de contas
		return Conta.cont;
	}
	
}