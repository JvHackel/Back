package heranca;

public class Agencia {

	
	private  int numAgencia;
	private String nomeAgencia;
	
	
	public Agencia(int numAgencia, String nomeAgencia) {
		super();
		this.numAgencia = numAgencia;
		this.nomeAgencia = nomeAgencia;
	}
	public int getNumAgencia() {
		return numAgencia;
	}
	public void setNumAgencia(int numAgencia) {
		this.numAgencia = numAgencia;
	}
	public String getNomeAgencia() {
		return nomeAgencia;
	}
	public void setNomeAgencia(String nomeAgencia) {
		this.nomeAgencia = nomeAgencia;
	}
	
	
}
