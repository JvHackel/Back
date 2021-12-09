package bancoNico;

public class TesteEmpregado {

	public static void main(String[] args) {
		Empregado nico = new Empregado();
		nico.setNome("marmota");
		nico.setCpf("097113");
		nico.setSalario(1019);
		
		System.out.println(nico.getNome() + " " + nico.getSalario());
		System.out.println("Nico recebe: " + nico.bonus());
		
		// se usassemos: private double salario; na classe Empregado ele permite acesso das classes filhas,
		// assim ainda tem o problema de mudar o salario
		// nico.salario = 500;  
	}
}