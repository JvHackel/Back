package ManipulacaoString;

 public class TestaString {

	public static void main (String [] args) {
	// Criando 
	
	String direta = "chatu";
	String nula = null;
	String indireta = new String("Marmota");
	 char [] Char = new char [] {'J','A','V','A' };
	StringBuilder top3 = new StringBuilder("doido");
	System.out.println(direta + " " + nula + " " + indireta + " "  + top3);
	System.out.println(Char);
	// Manipulando 
	
	
	String nome = "marmoti";
	nome = nome.toUpperCase();   // temos que atribuir ao nome uma nova referencia assim aumenta as letras
	System.out.println(nome);
	
	System.out.println(nome.charAt(0));
	System.out.println(nome.charAt(1));
	System.out.println(nome.charAt(2));
	// System.out.println(nome.charAt(7));
	
	System.out.println(nome.length());
	System.out.println(nome.isEmpty());
	System.out.println(nome.replace('a', 'i')); 
	
	System.out.println(direta.equals(indireta));
	System.out.println("marmota".compareTo("Arnaldo"));    // +
	System.out.println("marmota".compareTo("marmota"));   // 0
	System.out.println("marmota".compareTo("naldo"));     // -
	System.out.println("marmota".compareTo("MARMOTA"));    // +
	System.out.println("MARMOTA".compareTo("marmota"));   // -
	
	String[] valores = new String[2];
    valores[0] = "Certificação";
    valores[1] = "Java";
    Object[] vals = (Object[]) valores;
    vals[1] = "Daniela";
    System.out.println(vals[1].equals(valores[1]));
    
   
	
	}
	
	}
