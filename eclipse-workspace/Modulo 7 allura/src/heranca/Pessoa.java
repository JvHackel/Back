package heranca;

// http://www.universidadejava.com.br/java/java-heranca/

public class Pessoa {

	private String nome;
	private String matricula;
	
	public Pessoa(String nome, String matricula) {   // construtor principal seguir a ordem dele
		
		this.nome = nome;
		this.matricula = matricula;
	}
	                                           

	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
}