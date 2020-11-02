package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		//Informações de um usuário
		
		//Tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L; // usar "_" facilita leitura do número, sempre usar o "L" para explicitar que é long
		
		//Tipos numéricos reais
		float salario = 11_445.44F; // sempre usar o "F" para explicitar que é float
		double vendasAcumuladas = 2_991_797_103.01;
		
		//Tipo booleano
		boolean estaDeFerias = false;
		
		//Tipo caractere
		char status = 'A'; //A de ativo
		
		//Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		//Número de viagens
		System.out.println(numeroDeVoos / 2);
		
		//Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + " ganha -> " + salario);
		System.out.println("Está de férias? " + estaDeFerias);
		System.out.println("Status: " + status);
	}
}
