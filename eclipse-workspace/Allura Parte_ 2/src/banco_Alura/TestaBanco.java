package banco_Alura;

public class TestaBanco {
	public static void main(String[] args) {
		
		Cliente first = new Cliente();
		first.setNome("Marmota");
		first.setCpf ("097113");
		first.setJob( "enge");
		
		Conta firstConta = new Conta();
		firstConta.deposita(100);
		
		firstConta.setTitular(first) ;  // ao deixar privado temos que usar os getters e setters 
		System.out.println(first.getCpf() + " " + first.getNome() + " " + first.getJob());
		System.out.println(firstConta.getSaldo());
		//============ Testando Get e Set ===============
		Conta testandoGet = new Conta();
		testandoGet.setNumero(5);
		System.out.println(testandoGet.getNumero());
		
		testandoGet.setTitular(first);
		System.out.println(testandoGet.getTitular().getNome());  
		// aqui aponta uma seta para uma variavel que aponta para outra
		
		// faltou 2 minutos de aula - muito sono
	}
}
