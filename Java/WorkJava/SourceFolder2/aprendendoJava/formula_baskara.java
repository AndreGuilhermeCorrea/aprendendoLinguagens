package aprendendoJava;

import java.util.Scanner;


//public class � uma classe chamada funcoes
//dentre as chaves esta presente o bloco
public class formula_baskara {

	//as fun�oes s�o processamentos que representam um significado
		//Math.sqrt � a fun��o para calculo de ra�z quadrada
		
		// as vantagens s�o: 
			//modulariza��o: divide programa em v�rias partes ou v�rios m�dulos
			//delega��o: delega a l�gica de calcular tornando o programa mais enxuto
			//reaproveitamento: reaproveitar as fun�oes

		//podem ainda receber dados de entrada(par�metros e argumentos) e podem tb ou nao retornar uma sa�da
		
		//*****vale lembrar que as orienta�oes a objetos as fun�oes em classes recebem o nome de m�todo
	
	
	//main � uma funcao  tb entre chaves que a delimitam 
	//public serve para que a funcao seja dispon�vel para outras classes
	//static para que a fun��o possa ser chamada independente de criar um objeto
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		//vari�veis inteiras para calculo da equa��o do 2� grau
		int a, b, c;
		
		System.out.println("A f�rmula de Bhaskara � um c�lculo matem�tico para determinar as ra�zes de uma fun��o de 2� grau.");
		System.out.println("Vamos calcular fun��o do 2� Grau(ax� + bx + c = 0) pela f�rmula de Bhaskara?");
		
		System.out.println("Digite o valor de a: ");
		
		//entrada de dados do tipo inteiro para a fun��o 
		a = sc.nextInt();
		System.out.println("Digite o valor de b: ");
		b = sc.nextInt();
		System.out.println("Digite o valor de c: ");
		c = sc.nextInt();
		
		
		//processamento de dados
		
		//calculando delta com tipo double
		double delta;
		delta = Math.pow(b, 2.0) - 4* a * c;
		System.out.println("Para a Fun��o do 2� Grau: " +a+"x� + " +b+"x + "+c);
		
		//*********Math � uma classe chamada apartir do proprio nome da classe sem necessidade de objetos
		//*********sqrt() � um membro estatico da classe Math
		//estrutura condicional se senao
		if (delta >= 0) {
			System.out.println("O Valor de DELTA �: " + delta);
			double x1, x2; 
			x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
			x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
			
			System.out.println("O X� raiz dessa fun��o �: " + x1);
			System.out.println("O x� raiz dessa fun��o �: " + x2);
		}
		else {
			System.out.println("Seu delta resultou em n�mero negativo!");
		}
		
		
		//m�ximo � uma vari�vel tipo int
		//max � uma fun��o personalizada criada abaixo para encontrar o maior valor entre a b c
		//x y z � atribuido pois quando for chamada a fun��o acima ela automaticamente sera atribuido na fun��o
		
		
		int maximo = max(a, b, c);
		
		exibirResultado(maximo);
		
		//elemento para finalizar o scanner
		sc.close();
	
	}
	
	//max � uma funcao personalizada e criada 
	//entre chaves est�o implementadas as logica da fun��o que a delimitam
	//essa fun��o esta criada dentro do bloco da classe
	//x y z � atribuido pois quando for chamada a fun��o acima ela automaticamente sera atribuido na fun��o 
	//declarar tipo de dado que essa fun��o retona int 
	//max � o nome da fun��o
	//entre os parenteses se encontra os parametros dessa fun��o
	public static int max(int x, int y, int z) {
		//as variaveis s�o alocadas temporariamente e apenas quando a fun��o for chamada
		//quando a execu��o da estrutura acaba as vari�veis sao desalocada automaticamente
		int auxiliar;
		if (x > y && x > z) {
			auxiliar = x;
		} else if (y > z) {
			auxiliar = y;
		} else {
			auxiliar = z;
		}
		//return � um comando que designa o que a fun��o criada ir� retornar no caso o valor da vari�vel inteira auxiliar
		return auxiliar;
	}
	
	//void � o mesmo que vazio
	//exibir resultado � o nome dessa outra fun��o
	//seus par�metros s�o os valores inteiros
	public static void exibirResultado(int valor) {
		//o sistema ira apenas imprimir na tela os valor da fun��o maximo 
		//e void sem retornar nada apenas imrimir na tela
		System.out.println("O maior valor encontrado na Equa��o foi : " + valor);
	}

}
