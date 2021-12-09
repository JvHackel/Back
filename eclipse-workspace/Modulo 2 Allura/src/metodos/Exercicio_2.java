package metodos;


class F{
    void x(int... x) {
        System.out.println(x.length);
    }
}
public class Exercicio_2 {
	public static void main(String[] args) {
        new F().x(23789,673482);
    }
}