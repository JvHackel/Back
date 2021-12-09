package excecoes;

		class FazAlgo{
	 void FazAlgo (int [] idade){
		System.out.println(idade[1]);
	}
	}
	public class TestaException {
	public static void main(String[] args) {
		
		FazAlgo m = new FazAlgo();
        m.FazAlgo(new int [0]);
        System.out.println(m);
	}

}
