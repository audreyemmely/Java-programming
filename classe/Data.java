package classe;

public class Data {
	int dia;
	int mes;
	int ano;
	
	String obterDataFormatada() {
		return String.format("%d/%d/%d\n", dia, mes, ano);
	} // esse tipo de m�todo funcionar� em diversas aplica��es
	
	void imprimirDataFormatada() {
		System.out.println(obterDataFormatada());
	} // esse tipo de m�todo s� funcioar� dentro de uma aplica��o em terminal
}
