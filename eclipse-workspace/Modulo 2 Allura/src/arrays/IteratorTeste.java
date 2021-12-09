package arrays;

import java.util.ArrayList;
import java.util.Iterator;   // tambem tem que ser importado


public class IteratorTeste {

	
	public class TestaArrayList2 {
		
		public static void main(String[] args) {
			
			ArrayList<String> names= new ArrayList<>();
			
			names.add("marmota");
			names.add("cremosa");
			names.add("doida");
			
			
		Iterator<String> it = names.iterator();	
			
		while(it.hasNext()) {
			String atualIt = it.next();
			System.out.println(atualIt);
			ArrayList<String> l = new ArrayList<String>();
	        l.add("a");
	        l.add("b");
	        l.add(1,"amor");
	        l.add(3,"baixinho");
	        System.out.println(l);
	     
	        System.out.println(l.toArray());
	        
	        ArrayList<String> a = new ArrayList<String>();
	        a.add(0,"a");
	        a.add(0,"b");
	        a.add(0,"c");
	        a.add(0,"d");
	        System.out.println(a.get(0));
	        System.out.println(a.get(1));
	        System.out.println(a.get(2));
	        System.out.println(a.get(3));
	        
	            // Exercicio 8
	            ArrayList<String> b = new ArrayList<String>();
	            b.add(0,"a");
	            b.add(1,"b");
	            for(Iterator<String> i=b.iterator();i.hasNext();i.next()) {
	                String element = i.next();
	                System.out.println(element);
	            }
	            // Exercicio 9
	            ArrayList<String> ss = new ArrayList<String>();
	            ss.add("a");
	            ss.add("b");
	            ss.add("c");
	            ss.add("d");

	            for(String s:ss){
	                if(s.equals("c")) s = "b";
	                else if(s.equals("b")) s= "c";
	            }
	            for(String s:ss) System.out.println(s);
	        }
	        }
	        }
		}
		

