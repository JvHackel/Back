package heranca;

import heranca.*;

public class TesteEmpregado {

	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa("Marmota" , "123");
		Empregados emp1 = new Empregados(pessoa1.getNome(),"RH", pessoa1.getMatricula());
		Coordenador one = new Coordenador(pessoa1.getNome(),pessoa1.getMatricula(), "Engenharia");
		Aluno al1 = new Aluno(pessoa1.getNome(), pessoa1.getMatricula());
		
		Pessoa pessoa2 = new Pessoa("Marcos", "157");
		Coordenador two = new Coordenador(pessoa2.getNome(), pessoa2.getMatricula(), "Sociais" );
		
		System.out.println(" O nome do novo empregado e: " + pessoa1.getNome() + " e o departamento e: "+ emp1.getDepartamento() );
		System.out.println(" O nome do novo coordenador e: " + one.getNome() + " sua matricula foi: " + pessoa2.getMatricula());
	
	}

	
	
}
