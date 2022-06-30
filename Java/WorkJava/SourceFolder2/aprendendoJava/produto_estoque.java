package aprendendoJava;

import java.util.Locale;
import java.util.Scanner;

import entidade.produto;

public class produto_estoque {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		produto produto = new produto();
		System.out.println("Entre com o produto:");
		
		System.out.println("Nome: ");
		produto.nomeProduto = sc.nextLine();
		
		System.out.println("Insira o Valor do produto: ");
		produto.precoProduto = sc.nextDouble();
		
		
		System.out.println("Insira a quantidade do produto: ");
		produto.quantidadeProduto = sc.nextInt();
		
		//impressao provisória para testar o programa
		System.out.println("Produto inserido no Sistema com sucesso! Segue: " + produto.nomeProduto + " ___ " + produto.precoProduto + " ___ " +produto.quantidadeProduto);
		
		
		System.out.println("Produto inserido no Sistema com sucesso! Segue: " + produto);
		
		
		System.out.println("Produto inserido no Sistema com sucesso! Segue: " + produto.toString());
		
		System.out.println();
		System.out.println("Entre com a quantidade de produtos para adicionar ao estoque: ");
		int quantidadeProduto = sc.nextInt();
		produto.adicionarProdutoEstoque(quantidadeProduto);
		
		System.out.println();
		System.out.println("Estoque de produtos atualizados com mais: " + quantidadeProduto + " Unidades"); 
		System.out.println();
		System.out.println("Dados Atualizados no Sistema para: " + produto.nomeProduto + " ___ " + produto.precoProduto + " ___ " +produto.quantidadeProduto);
		System.out.println();
		System.out.println("Dados Atualizados no Sistema para: " + produto);
		
		
		System.out.println();
		System.out.println("Entre com a quantidade de produtos para aplicar baixa ao estoque: ");
		quantidadeProduto = sc.nextInt();
		produto.removerProdutoEstoque(quantidadeProduto);
		
		System.out.println();
		System.out.println("Estoque de produtos atualizados com menos: " + quantidadeProduto + " Unidades"); 
		System.out.println();
		System.out.println("Dados Atualizados no Sistema para: " + produto.nomeProduto + " ___ " + produto.precoProduto + " ___ " +produto.quantidadeProduto);
		System.out.println();
		System.out.println("Dados Atualizados no Sistema para: " + produto);
		
		
		
		
		sc.close();
		
	}

}
