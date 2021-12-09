package metodos;
import java.util.Scanner;

 class Moto {
	public static int totalmotos ;
	
	static String Marca;
}

public class TestaMetodos {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int total ;
		
		System.out.println("Digite o total de motos: " );
		Moto.totalmotos = in.nextInt();
		
		System.out.println("Digite a marca motos: " );
		Moto.Marca = in.nextLine();

		
		System.out.println(Moto.totalmotos);
		System.out.println(Moto.Marca);
		
      }
	}