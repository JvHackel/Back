package heranca;

public class TestandoHerancas {

	public static void main(String [] args) {
		
		Y oi = new Y();
		oi.x = 15;
		oi.y();
		
       Marmota.frase();
       HerdeiroMarmota.frase();
	}
}
	
	class x{
		 int x;             //  se fosse private daria erro
		public void y() {   //  se fosse private daria erro
			System.out.println("Marmota");
		}
	}
	class Y extends x {
		
	}
	
	class Marmota {
		
		public static void frase() {
			System.out.println("veja que essa frase vem daqui, mas foi herdada pela classe HerdeiroMarmota");
		}
	}
	class HerdeiroMarmota extends Marmota{
			
	}	