package classe;

public class Data {
	int dia;
	int mes;
	int ano;
	
	String obterDataFormatada() {
		return String.format("%d/%d/%d\n", dia, mes, ano);
	} // esse tipo de método funcionará em diversas aplicações
	
	void imprimirDataFormatada() {
		System.out.println(obterDataFormatada());
	} // esse tipo de método só funcioará dentro de uma aplicação em terminal
}
