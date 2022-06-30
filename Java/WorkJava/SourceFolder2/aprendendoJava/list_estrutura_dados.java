package aprendendoJava;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class list_estrutura_dados {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("André");// posição 0
		list.add("João");// posição 1
		list.add("Maria");// posição 2
		list.add("Gisele");// posição 3
		list.add("Xarelto");// posição 4

		list.add(2, "Gabriel");// adicionar mais um elemento na lista nesse cadso na posição 2 sem prejudicar o
								// restante da lista

		System.out.println(list.size());// imprime na tela o tamanho da lista

		for (String x : list) {
			System.out.println(x);

		}

		list.remove(3);// remove o elemento da posição
		list.remove("Maria");// remove o elemento por comparação
		list.removeIf(x -> x.charAt(0) == 'X'); // remove por predicado ou seja função lambda
		System.out.println("___________________");
		for (String x : list) {
			System.out.println(x);

		}

		System.out.println("___________________");
		System.out.println("Index of Gabriel: " + list.indexOf("Gabriel")); //retorna a posição do elemento no caso por comparação
		System.out.println("___________________");
		
		//filtrar elementos da lista
		//primeiro é a conversão da lista em stream
		//faz a conversão necessaria 
		//para novamente converter em lista
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'G').collect(Collectors.toList());
		
		for (String x : result) {
			System.out.println(x);

		}
		System.out.println("___________________");
		
		
		//comando para encontrar o primeiro elemento com base no predicado
		//com a letra nesse caso G se nao houver esse elemento do filtro ele retornara nesse caso  como nulo
		String nome = list.stream().filter(x -> x.charAt(0) == 'G').findFirst().orElse(null);
		System.out.println(nome);
		
	}

}
