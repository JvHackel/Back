package banco_Alura;

public class TestaValores {

	public static void main(String[] args) {
		
		/*Conta conta = new Conta();  // esses parenteses invocam o construtor
		conta.setAgencia("Itau");
		conta.setNumero(4);
		
		conta.setSaldo(45);
		conta.setTitular( new Cliente());
		
		Conta conta1 = new Conta();
		conta1.setNumero(5);
		
		Cliente marmota = new Cliente();
		marmota.setNome("Jv");
		
		System.out.println(marmota.getNome());
		// conta.setAgencia(-50);  // no caso teriamos que modificar para int o set la na Conta
		
		System.out.println( Conta.getCont()); */
		
		Conta conta3 = new Conta(1337, 23334);

        conta3.deposita(200.0);

        System.out.println(conta3.getSaldo());

        
        conta3.setAgencia(570);

        System.out.println(conta3.getAgencia());

        
        
        Conta conta4 = new Conta();
        
        conta4.deposita(100);
        conta4.setAgencia(50);
        System.out.println("o total de contas é : " + Conta.getCont());
        
	}
}