package bancoNico;
import java.util.Scanner;

public class TesteGerente {          // diferente do prof pedi para o usuario digitar uma senha para dar acesso somente ao gernte

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		
		int senha;
		Gerente g1 = new Gerente();
		g1.setNome("Clebson");
		g1.setSalario(3500);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getSalario());
		
		System.out.println("Digite a senha: ");
		senha = in.nextInt();
		
		boolean senhaTeste = g1.autentica(senha);
		System.out.println(senhaTeste);
		
	}

}
