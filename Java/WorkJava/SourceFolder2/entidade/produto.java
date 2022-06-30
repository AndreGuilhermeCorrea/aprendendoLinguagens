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
		classe e nao o par�metro metodo da fun��o*/ += quantidadeProduto; /*ou seja representa a soma do argumento com a classe*/
		
		
	}
	
	public void removerProdutoEstoque(int quantidadeProduto) {
		this.quantidadeProduto -= quantidadeProduto;
		
	}
	
	public String toString() {
		return nomeProduto
		
				
				//esse algoritimo esta representando os dois tipos de informa��o com e sem formata��o
		+ ", R$"
		//preco sem formata��o
		+ precoProduto + " por Unidade. " 
		+ " R$ "
		//preco com formata��o com 2 casas decimais
		+ String.format("%.2f", precoProduto)
		+ " por Unidade. "
		+ quantidadeProduto
		+ " unidades em estoque, Total monet�rio em estoque: R$ "
		//total de valor sem formata��o 
		+"    " + totalValorEmEstoque() + "    " 
		+ " Total monet�rio em estoque: R$ "
		//total de valor com formata��o 
		+ String.format("%.2f", totalValorEmEstoque());
		
		
		
	}

}
