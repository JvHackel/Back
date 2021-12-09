package polimorfismo;

public class Exercicios {


	interface Veiculo {
	    int getMarcha();
	    void liga();
	    
	}

	abstract class Carro implements Veiculo {
	    public void liga()  {
	        System.out.println("ligado!");
	    }
	}

	class CarroConcreto extends Carro implements Veiculo {
	    public int getMarcha() {
	        return 1;
	    }
	}
}