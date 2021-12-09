package diferencas_entre_Variaveis;

public class TesteReferencia {

	String modelo;
	int ano;
	
public void Carro() { ano  = 2012; }

public String Impressao() {
	
	return modelo + " - " + ano;
}
public void setModelo(String model) {
	this.modelo = model;
}

}