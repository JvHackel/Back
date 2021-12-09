package financeiro;

 //import aula_1.Pessoa;   // importacao ajuda  ficar menor e menos confuso
import aula_1.*;   // aqui o * vai importar tudo dentro de aula_1
import Subpacote.*;
import aula_3.*;   
import static aula_3.Util.tam; 
// import static aula_3.Util.*;  podia ter importado tudo direto

public class Pedido {

	Pessoa cliente;
	aula_3.Endereco endereco;    // aqui tem que fazer uma referencia local 
	Produto product;   // foi importado acima
	ClasseSubpacote sub;
	
	public Pessoa getCliente(){   // como esta em outro pacote temos que fazer a referencia aula_1.Pessoa
		return cliente;
	}
	
	public void calculaTudo () {
		
		int t = Util.tam;                               
		Util.maior(5, 10);
		
	}
}
