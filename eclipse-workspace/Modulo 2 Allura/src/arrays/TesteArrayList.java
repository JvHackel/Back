package arrays;

import java.util.ArrayList;     // sempre tem que importar
import java.util.Iterator;
public class TesteArrayList {

	public static void main(String[] args) {
		
		ArrayList <String> names = new ArrayList <>();
        
		names.add("marmota");
		names.add("linda");
		names.add("marmota");    // ele vai imprimir uma vez que o Array List aceita duplicatas
		
		System.out.println(names);
		System.out.println(names.contains("marmot"));  // return true or false
		
		boolean removed = names.remove("marmota");
		System.out.println(removed);
		
		System.out.println(names.contains("marmota"));
		System.out.println(names);
		
		System.out.println(names.size());   // metodo size 
		
	    Object [] name = names.toArray();    // converteu para Array de forma generica
	
	    Object [] nameArray = names.toArray(new String [names.size()] );   // converteu para String
	
	    Object [] nameArray2 = names.toArray(new String [1] );
	    
	    ArrayList <String> tudo = new ArrayList <>();
	    
	    ArrayList <String> paises = new ArrayList <>();
	    
	    paises.add("Korea" ); paises.add("Japan" );
	    
	    tudo.addAll(names);   // inclui sempre no final
	    tudo.addAll(paises);
	    System.out.println(tudo);
	    
	    System.out.println(names.get(0));
	    System.out.println(tudo.get(3));
	
	   
				
				ArrayList<String> nomes= new ArrayList<>();
				
				nomes.add("marmota");
				nomes.add("cremosa");
				nomes.add("doida");
				
			Iterator<String> it = nomes.iterator();	
				
			while(it.hasNext()) {
				String atualIt = it.next();
				System.out.println(atualIt);
				it.remove();
			}
			System.out.println(	nomes.size());
			}
		}