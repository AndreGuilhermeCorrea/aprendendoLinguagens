package entidade;

public class produto_vs3 {

	private String nomeProdutoVs3;
	private double precoProdutoVs3;
	private int quantidadeProdutoVs3;// atributo da classe

	// adicionando construtores e devem ser dispostos após os atributos
	// construtuor que recebe 03 elementos
	public produto_vs3(String nomeProdutoVs3, double precoProdutoVs3, int quantidadeProdutoVs3) {
		// executa no momento da instanciacao do objeto

		// a palavra this refere-se ao atributo do objeto recebe no caso o parametro do
		// objeto
		this.nomeProdutoVs3 = nomeProdutoVs3;
		this.precoProdutoVs3 = precoProdutoVs3;
		this.quantidadeProdutoVs3 = quantidadeProdutoVs3;

	}

	public produto_vs3(String nomeProdutoVs3, double precoProdutoVs3) {
		// executa no momento da instanciacao do objeto

		// a palavra this refere-se ao atributo do objeto recebe no caso o parametro do
		// objeto
		this.nomeProdutoVs3 = nomeProdutoVs3;
		this.precoProdutoVs3 = precoProdutoVs3;
		this.quantidadeProdutoVs3 = 0;

	}

	public double totalValorEmEstoqueVs3() {

		return precoProdutoVs3 * quantidadeProdutoVs3;

	}

	public void adicionarProdutoEstoqueVs3(int quantidadeProdutoVs3/* parametro metodo */ ) {

		this./* palavra reservado que significa referencia para objeto */
				quantidadeProdutoVs3/* acesso ao atributo da classe e nao o parâmetro metodo da função */
						+= quantidadeProdutoVs3; /* ou seja representa a soma do argumento com a classe */

	}

	public void removerProdutoEstoqueVs3(int quantidadeProdutoVs3) {
		this.quantidadeProdutoVs3 -= quantidadeProdutoVs3;

	}

	public String toString() {
		return nomeProdutoVs3 + " R$ "
		// preco com formatação com 2 casas decimais
				+ String.format("%.2f", precoProdutoVs3) + " por Unidade. " + quantidadeProdutoVs3
				+ " unidades em estoque. " + "Total monetário em estoque: R$ "
				// total de valor com formatação
				+ String.format("%.2f", totalValorEmEstoqueVs3());

	}

}
