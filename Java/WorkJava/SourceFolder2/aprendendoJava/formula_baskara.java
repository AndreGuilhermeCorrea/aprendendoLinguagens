package aprendendoJava;

import java.util.Scanner;


//public class é uma classe chamada funcoes
//dentre as chaves esta presente o bloco
public class formula_baskara {

	//as funçoes são processamentos que representam um significado
		//Math.sqrt é a função para calculo de raíz quadrada
		
		// as vantagens são: 
			//modularização: divide programa em várias partes ou vários módulos
			//delegação: delega a lógica de calcular tornando o programa mais enxuto
			//reaproveitamento: reaproveitar as funçoes

		//podem ainda receber dados de entrada(parâmetros e argumentos) e podem tb ou nao retornar uma saída
		
		//*****vale lembrar que as orientaçoes a objetos as funçoes em classes recebem o nome de método
	
	
	//main é uma funcao  tb entre chaves que a delimitam 
	//public serve para que a funcao seja disponível para outras classes
	//static para que a função possa ser chamada independente de criar um objeto
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		//variáveis inteiras para calculo da equação do 2º grau
		int a, b, c;
		
		System.out.println("A fórmula de Bhaskara é um cálculo matemático para determinar as raízes de uma função de 2º grau.");
		System.out.println("Vamos calcular função do 2º Grau(ax² + bx + c = 0) pela fórmula de Bhaskara?");
		
		System.out.println("Digite o valor de a: ");
		
		//entrada de dados do tipo inteiro para a função 
		a = sc.nextInt();
		System.out.println("Digite o valor de b: ");
		b = sc.nextInt();
		System.out.println("Digite o valor de c: ");
		c = sc.nextInt();
		
		
		//processamento de dados
		
		//calculando delta com tipo double
		double delta;
		delta = Math.pow(b, 2.0) - 4* a * c;
		System.out.println("Para a Função do 2º Grau: " +a+"x² + " +b+"x + "+c);
		
		//*********Math é uma classe chamada apartir do proprio nome da classe sem necessidade de objetos
		//*********sqrt() é um membro estatico da classe Math
		//estrutura condicional se senao
		if (delta >= 0) {
			System.out.println("O Valor de DELTA é: " + delta);
			double x1, x2; 
			x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
			x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
			
			System.out.println("O X¹ raiz dessa função é: " + x1);
			System.out.println("O x² raiz dessa função é: " + x2);
		}
		else {
			System.out.println("Seu delta resultou em número negativo!");
		}
		
		
		//máximo é uma variável tipo int
		//max é uma função personalizada criada abaixo para encontrar o maior valor entre a b c
		//x y z é atribuido pois quando for chamada a função acima ela automaticamente sera atribuido na função
		
		
		int maximo = max(a, b, c);
		
		exibirResultado(maximo);
		
		//elemento para finalizar o scanner
		sc.close();
	
	}
	
	//max é uma funcao personalizada e criada 
	//entre chaves estão implementadas as logica da função que a delimitam
	//essa função esta criada dentro do bloco da classe
	//x y z é atribuido pois quando for chamada a função acima ela automaticamente sera atribuido na função 
	//declarar tipo de dado que essa função retona int 
	//max é o nome da função
	//entre os parenteses se encontra os parametros dessa função
	public static int max(int x, int y, int z) {
		//as variaveis são alocadas temporariamente e apenas quando a função for chamada
		//quando a execução da estrutura acaba as variáveis sao desalocada automaticamente
		int auxiliar;
		if (x > y && x > z) {
			auxiliar = x;
		} else if (y > z) {
			auxiliar = y;
		} else {
			auxiliar = z;
		}
		//return é um comando que designa o que a função criada irá retornar no caso o valor da variável inteira auxiliar
		return auxiliar;
	}
	
	//void é o mesmo que vazio
	//exibir resultado é o nome dessa outra função
	//seus parâmetros são os valores inteiros
	public static void exibirResultado(int valor) {
		//o sistema ira apenas imprimir na tela os valor da função maximo 
		//e void sem retornar nada apenas imrimir na tela
		System.out.println("O maior valor encontrado na Equação foi : " + valor);
	}

}
