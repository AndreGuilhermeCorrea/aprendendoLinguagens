package entidade;

public class produto_vs2 {

	public String nomeProdutoVs2;
	public double precoProdutoVs2;
	public int quantidadeProdutoVs2;//atributo da classe
	
	public double totalValorEmEstoqueVs2() {
		
		return precoProdutoVs2 * quantidadeProdutoVs2;
		
	}
	
	
	public void adicionarProdutoEstoqueVs2(int quantidadeProdutoVs2/*parametro metodo*/ ) {
		
		this./*palavra reservado que significa referencia para objeto*/
				quantidadeProdutoVs2/*acesso ao atributo da classe e nao o parâmetro metodo da função*/ 
					+= quantidadeProdutoVs2; /*ou seja representa a soma do argumento com a classe*/
		
		
	}
	
	public void removerProdutoEstoqueVs2(int quantidadeProdutoVs2) {
		this.
			quantidadeProdutoVs2 
				-= quantidadeProdutoVs2;
		
	}
	
	public String toString() {
		return nomeProdutoVs2
					+ " R$ "
						//preco com formatação com 2 casas decimais
						+ String.format("%.2f", precoProdutoVs2)
								+ " por Unidade. "
									+ quantidadeProdutoVs2
										+ " unidades em estoque. "
												+ "Total monetário em estoque: R$ "
													//total de valor com formatação 
													+ String.format("%.2f", totalValorEmEstoqueVs2());
		
		
		
	}

}
