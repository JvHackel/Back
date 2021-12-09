package banco_Alura;
import java.util.Scanner;
public class TestandoMetodo_Conta {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		double saque;
		Conta first = new Conta();
		first.saldo = 100;
		first.deposita(50);

		System.out.println(first.saldo);
		
		
		System.out.println("Digite o valor do saque:" );
		saque = in.nextDouble();
		
		first.sacar(saque);
		System.out.println(first.saldo);
		
		// -------- Transferencia ----------- //
		
		Conta marmota = new Conta();
		marmota.deposita(1000);
		
		marmota.transferencia(300, first);
		// para melhorar o codigo podemos colocar transferencia dentro de um if, uma vez que e boolean o if aceita
		/* if(marmota.transferencia(300, first)){
		
	     System.out.println("Transferencia feita com sucesso");
	     }
	     else{
	     System.out.println("Faltou verdinhas, ta liso");
	     }
	     //Para deixar mais organizado: boolean sucessoTransfer = marmota.transferencia(300, first); */
		System.out.println(marmota.saldo);
		
		
		
	}
}