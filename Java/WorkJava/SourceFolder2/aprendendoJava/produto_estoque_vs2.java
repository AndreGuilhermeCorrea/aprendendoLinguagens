package aprendendoJava;

import java.util.Locale;
import java.util.Scanner;

import entidade.produto_vs2;

public class produto_estoque_vs2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		produto_vs2 produto_vs2 = new produto_vs2();
		System.out.println("Entre com o produto:");
		
		System.out.println("Nome: ");
		produto_vs2.nomeProdutoVs2 = sc.nextLine();
		
		System.out.println("Insira o Valor do produto: ");
		produto_vs2.precoProdutoVs2 = sc.nextDouble();
		
		
		System.out.println("Insira a quantidade do produto: ");
		produto_vs2.quantidadeProdutoVs2 = sc.nextInt();
		
		
		
		System.out.println("Produto inserido no Sistema com sucesso!");
		System.out.println(" Segue: "
					+ produto_vs2.toString());
		
		System.out.println();
		System.out.println("Entre com a quantidade de produtos para adicionar ao estoque: ");
		int quantidadeProdutoVs2  = sc.nextInt();
			produto_vs2.adicionarProdutoEstoqueVs2(quantidadeProdutoVs2);
		
		System.out.println();
		System.out.println("Estoque de produtos atualizados com mais: " 
					+ quantidadeProdutoVs2 
						+ " Unidades."); 
		System.out.println();

		System.out.println();
		
		System.out.println("Dados Atualizados no Sistema: " 
					+ produto_vs2);
		
		
		System.out.println();
		System.out.println("Entre com a quantidade de produtos para aplicar baixa ao estoque: ");
			quantidadeProdutoVs2  = sc.nextInt();
				produto_vs2.removerProdutoEstoqueVs2(quantidadeProdutoVs2);
		
		System.out.println();
		System.out.println("Estoque de produtos atualizados: " 
					+ quantidadeProdutoVs2  
						+ " Unidades."); 
		System.out.println();
		System.out.println();
		System.out.println();
		

		System.out.println("Dados Atualizados no Sistema: " 
					+ produto_vs2);
		
		
		
		
		sc.close();
		
	}

}
