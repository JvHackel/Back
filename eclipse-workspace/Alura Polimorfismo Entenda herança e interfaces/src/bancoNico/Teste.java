package bancoNico;

public class Teste {

	public static void main(String[] args) {
		
		Empregado f1 = new Empregado();  //Ao criarmos ele, temos que ter em mente que ele nascerá, por padrão, como um funcionário comum, já que nos atributos lhe foi atribuído um valor inicial de 0
		f1.setSalario(3000);
		
	 //	System.out.println(f1.getTipo());
        System.out.println(f1.bonus());
		
		FuncionarioTeste f2 = new FuncionarioTeste();
		f2.setTipo(1);
		f2.setSalario(5000);
		
		System.out.println(f2.getTipo());
        System.out.println(f2.bonus());
	}

}
