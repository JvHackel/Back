package stringBuilder;

public class TestaStringBufferEBuilder {

	public static void main (String [] args) {
		
		StringBuffer top = new StringBuffer("Marmota");
		top.append(" ");
		top.append("linda");
		System.out.println(top);
		
		StringBuffer top2 = new StringBuffer(15);  // aqui esta sendo criado um array com 0 a 49 posicoes, nao vai imprimir 50
		System.out.println(top2.toString());
		
		StringBuffer top3 = new StringBuffer(top);
		top3.append(" cremosa");
		System.out.println(top3);
		
		StringBuilder top4 = new StringBuilder(" doido");
		top4.insert(0,top);               // no lugar de top poderia ser colocado uma String entre aspas
		System.out.println(top4);
		
		top4.delete(13, 19);    // deletar tudo entre a posicao 14 e 18 no caso a palavra doido
		// System.out.println(top4);
		
		top4.toString();  // esse metodo sobrecrve o print mudando o objeto para String
		
		
		StringBuilder top5 = new StringBuilder("Marcos").reverse();
		System.out.println(top5);
		
		System.out.println(top4.substring(8));
		
		
		
	}
}