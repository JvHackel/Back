package bancoNico;

public class FuncionarioTeste {

		private String nome;
		private String cpf;
		private double salario;
		private int tipo = 0; // F Comum - 0 ; F Gerente - 1 ; F diretor - 2 

		public double bonus () {            // ele colocou getBonus
			
			if(this.tipo == 0) {            // F Comum
				return this.salario * 0.1; 
		}
			else if(this.tipo == 1 ) {      // F Gerente
				return this.salario ;
			}
			else {                          // F Diretor
				return this.salario + 1000;
		}
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
		public double getSalario() {
			return salario;
		}
		public void setSalario(double salario) {
			this.salario = salario;
		}

		public int getTipo() {
			return tipo;
		}

		public void setTipo(int tipo) {
			this.tipo = tipo;
		}
		
			
	}