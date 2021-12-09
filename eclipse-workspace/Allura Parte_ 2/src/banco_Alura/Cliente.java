package banco_Alura;

public class Cliente {

	// Toda conta vai ter um cliente associado sendo que o mesmo vai ter suas proprias variaveis.
    private String nome;
    private String cpf;
    public String job;
	
	public Cliente(String nome, String cpf, String job) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.job = job;
	}

	public Cliente() {
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
}