package aprendendoJava;

import java.util.Locale;
import java.util.Scanner;

import entidade.produto_vs3;

public class produto_estoque_vs3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com o produto:");

		System.out.println("Nome: ");
		String nomeProdutoVs3 = sc.nextLine();

		System.out.println("Insira o Valor do produto: ");
		double precoProdutoVs3 = sc.nextDouble();

		produto_vs3 produto_vs3 = new produto_vs3(nomeProdutoVs3, precoProdutoVs3);

		System.out.println("Produto inserido no Sistema com sucesso!");
		System.out.println(" Segue: " + produto_vs3.toString());

		System.out.println();
		System.out.println("Entre com a quantidade de produtos para adicionar ao estoque: ");
		int quantidadeProdutoVs3 = sc.nextInt();
		produto_vs3.adicionarProdutoEstoqueVs3(quantidadeProdutoVs3);

		System.out.println();
		System.out.println("Estoque de produtos atualizados com mais: " + quantidadeProdutoVs3 + " Unidades.");
		System.out.println();

		System.out.println("Dados Atualizados no Sistema: " + produto_vs3);

		System.out.println();
		System.out.println("Entre com a quantidade de produtos para aplicar baixa ao estoque: ");
		quantidadeProdutoVs3 = sc.nextInt();
		produto_vs3.removerProdutoEstoqueVs3(quantidadeProdutoVs3);

		System.out.println();
		System.out.println("Estoque de produtos atualizados: " + quantidadeProdutoVs3 + " Unidades.");
		System.out.println();

		System.out.println("Dados Atualizados no Sistema: " + produto_vs3);

		sc.close();

	}

}
