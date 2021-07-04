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
	// � poss�vel existir dois m�todos com mesmo nome, contanto que eles tenham qtdd de vari�veis diferentes
}
