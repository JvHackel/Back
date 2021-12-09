package heranca;

public class Conta {
	
	private Agencia agencia;
	private double saldo;
	private int qtdSaque =0;
	
	public Conta(Agencia agencia, double saldo, int qtdSaque) {
		super();
		this.agencia = agencia;
		this.saldo = saldo;
		this.qtdSaque = qtdSaque;
	}
	
	

}
