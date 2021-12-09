package heranca;

public class Coordenador extends Pessoa {

	private String curso;
	
	public Coordenador(String nome,  String matricula, String curso) {
		
		super(nome, matricula);                // heranca obrigatorio em super aqui so vai o que for da superclasse
		this.curso = curso; 
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
}
