package entidade;

public class produto {

	public String nomeProduto;
	public double precoProduto;
	public int quantidadeProduto;//atributo da classe
	
	public double totalValorEmEstoque() {
		
		return precoProduto * quantidadeProduto;
		
	}
	
	
	public void adicionarProdutoEstoque(int quantidadeProduto/*parametro metodo*/ ) {
		
		this./*palavra reservado que significa referencia para objeto*/quantidadeProduto/*acesso ao atributo da 
		classe e nao o parâmetro metodo da função*/ += quantidadeProduto; /*ou seja representa a soma do argumento com a classe*/
		
		
	}
	
	public void removerProdutoEstoque(int quantidadeProduto) {
		this.quantidadeProduto -= quantidadeProduto;
		
	}
	
	public String toString() {
		return nomeProduto
		
				
				//esse algoritimo esta representando os dois tipos de informação com e sem formatação
		+ ", R$"
		//preco sem formatação
		+ precoProduto + " por Unidade. " 
		+ " R$ "
		//preco com formatação com 2 casas decimais
		+ String.format("%.2f", precoProduto)
		+ " por Unidade. "
		+ quantidadeProduto
		+ " unidades em estoque, Total monetário em estoque: R$ "
		//total de valor sem formatação 
		+"    " + totalValorEmEstoque() + "    " 
		+ " Total monetário em estoque: R$ "
		//total de valor com formatação 
		+ String.format("%.2f", totalValorEmEstoque());
		
		
		
	}

}
