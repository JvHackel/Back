package operadores;

public class Strings {

	public static void main(String[] args) {
		
		String tex = "marmota";
        String out = "linda";
        String sub = tex.substring(0,5);
        
        
        System.out.println(tex + " " + out);
        System.out.println("marmota"  + " linda");
        System.out.println(sub);
        System.out.println(tex.toUpperCase());
        String s1 = "s1";
        String s2 = s1.substring(0,1 ) + s1.substring(1,2);
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s2);
      
       
        
        }      
	} 

	
	