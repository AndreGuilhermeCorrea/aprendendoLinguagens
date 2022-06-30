package aprendendoJava;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class list_estrutura_dados {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("Andr�");// posi��o 0
		list.add("Jo�o");// posi��o 1
		list.add("Maria");// posi��o 2
		list.add("Gisele");// posi��o 3
		list.add("Xarelto");// posi��o 4

		list.add(2, "Gabriel");// adicionar mais um elemento na lista nesse cadso na posi��o 2 sem prejudicar o
								// restante da lista

		System.out.println(list.size());// imprime na tela o tamanho da lista

		for (String x : list) {
			System.out.println(x);

		}

		list.remove(3);// remove o elemento da posi��o
		list.remove("Maria");// remove o elemento por compara��o
		list.removeIf(x -> x.charAt(0) == 'X'); // remove por predicado ou seja fun��o lambda
		System.out.println("___________________");
		for (String x : list) {
			System.out.println(x);

		}

		System.out.println("___________________");
		System.out.println("Index of Gabriel: " + list.indexOf("Gabriel")); //retorna a posi��o do elemento no caso por compara��o
		System.out.println("___________________");
		
		//filtrar elementos da lista
		//primeiro � a convers�o da lista em stream
		//faz a convers�o necessaria 
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
