package exercicios_Heranca;

public class Exercicio1 {

	// O c�digo n�o compila pois h� um ciclo na heran�a.
	
	class B extends C { int m(int a) { return 1; } }
	class C extends A { int m(double b) { return 3; } }
	class A extends B {
	    int m(String c) { return 3; }
	    public static void main(String[] args) {
	        System.out.println(new C().m(3));
	    }
	}
}
