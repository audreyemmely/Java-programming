package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		//Informa��es de um usu�rio
		
		//Tipos num�ricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L; // usar "_" facilita leitura do n�mero, sempre usar o "L" para explicitar que � long
		
		//Tipos num�ricos reais
		float salario = 11_445.44F; // sempre usar o "F" para explicitar que � float
		double vendasAcumuladas = 2_991_797_103.01;
		
		//Tipo booleano
		boolean estaDeFerias = false;
		
		//Tipo caractere
		char status = 'A'; //A de ativo
		
		//Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		//N�mero de viagens
		System.out.println(numeroDeVoos / 2);
		
		//Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + " ganha -> " + salario);
		System.out.println("Est� de f�rias? " + estaDeFerias);
		System.out.println("Status: " + status);
	}
}
