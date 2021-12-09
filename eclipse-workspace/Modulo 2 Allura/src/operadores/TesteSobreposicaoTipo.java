package operadores;

public class TesteSobreposicaoTipo {

	public static void main(Strings [] args ) {
		
	long soma;
	int idade = 15;
	long falta = 5;
	soma = idade + falta;
	System.out.println(soma);
	byte m = 2;
	short s = 2;
	int i = m + s;
	System.out.println(i);
	int b = 2;
	++b;
	
	System.out.println(b);
	int a = 10;
	a += ++a + a + ++a;
	System.out.println(a);
	
 }
}
