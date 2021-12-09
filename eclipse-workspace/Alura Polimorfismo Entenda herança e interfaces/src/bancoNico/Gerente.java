package bancoNico;

public class Gerente extends Empregado{  // gerente e um funcionario ele vem de funcionario pois tambem e um empregado assim ele e uma extensa, ou seja estende de empregado

	private int senha = 5;  // declarei a senha como 5 
	
	public boolean autentica (int tentativaSenha) {
		return this.senha == tentativaSenha;
	}
	@Override       
	public double bonus () {   // ele colocou getBonus esse metodo ja tem na classe mae ele foi reescrito
		// return this.salario;
		System.out.println("Teste de bonus do GERENTE"); // na aula Aplicando Polimorfismo em 14:37 ele adc esse print para diferenciar do metodo bonus do empregado
		
		return super.getSalario() + super.bonus();  // super.salario - mostra que salario vem da classe pai
		// super.bonus() - pega o metodo da classe mae Empregado
		// Ps: se colocasse o this.bonus() ele mesmo iria ficar se chamando dando erro num loop
		
		
		
		
	} 
	
}