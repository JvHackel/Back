package metodos;

public class Construtores2 {

	class B{
	    int b;
	    public void setB(int b) { b= b; }
	}
	 public static void main(String[] args) {
		 B b = new B();
	        b.setB(5);
	        System.out.println(b.b);
	    }
	   
	}
