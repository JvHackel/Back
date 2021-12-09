package aula_1;

//definido o escopo de variaveis 
// variavel local existe dentro de um metodo ou de um construtor, nao podendo ser acessada em outros metodos
public class Teste_1 {

	public static void main(String [] args) {
		
		Teste_1 t = new Teste_1();
		t.m3("Guilherme");
		
	}
	
	public void m1() {
		
		int x = 11;
		if(x >= 10) {              
			int y = 50;            // a variavel y so existe dentro desse bloco
	    System.out.println(y);
		}
		// System.out.println(y);    //  y dentro do bloco de chaves do if ela nao sera impressa ERRO
		System.out.println(x);  // essa variavel x existe dentro desse bloco
	}
	public void m3(String nome) {   // a variavel local so pode ser acessada dentro desse metodo
	}
	public void m4() {
		
	}
}
