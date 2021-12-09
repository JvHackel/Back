package heranca;

public class Empregados extends Pessoa {

	private String departamento;
	
	public Empregados(String nome,  String matricula,String departamento) {
		super(nome, matricula);
		this.departamento = departamento;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
}
