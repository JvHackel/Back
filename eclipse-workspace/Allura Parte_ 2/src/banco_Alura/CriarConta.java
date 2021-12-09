package banco_Alura;

public class CriarConta {

	public static void main(String[] args) {
		
		Conta first = new Conta();
		first.saldo = 150;
		first.agencia = "3108-9";
		System.out.println(first.saldo + " " + first.agencia);
		
		Conta second = new Conta();
		second.saldo = 50;
		
		first.saldo += 50;
		System.out.println(first.saldo);
		
		System.out.println();
	}
}
