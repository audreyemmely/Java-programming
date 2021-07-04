package classe;

public class Produto {
	String nome;
	double preco;
	double desconto;
	
	Produto(String nomeInicial) {
		nome = nomeInicial;
	}
	
	Produto() {
		
	}
	
	double precoComDesconto() {
		return preco * (1 - desconto);
	}
	
	double precoComDesconto(double descontoDoGerente) {
		return preco * (1 - desconto + descontoDoGerente);
	}
	// é possível existir dois métodos com mesmo nome, contanto que eles tenham qtdd de variáveis diferentes
}
