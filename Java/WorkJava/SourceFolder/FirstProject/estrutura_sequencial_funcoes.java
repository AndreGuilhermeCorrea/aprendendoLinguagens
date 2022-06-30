package FirstProject;

import java.util.Scanner;

public class estrutura_sequencial_funcoes {
	
	
	//as funçoes são processamentos que representam um significado
	//Math.sqrt é a função para calculo de raíz quadrada
	
	// as vantagens são: 
		//modularização: divide programa em várias partes ou vários módulos
		//delegação: delega a lógica de calcular tornando o programa mais enxuto
		//reaproveitamento: reaproveitar as funçoes

	//podem ainda receber dados de entrada(parâmetros e argumentos) e podem tb ou nao retornar uma saída
	
	//*****vale lembrar que as orientaçoes a objetos as funçoes em classes recebem o nome de método
	
	
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
		
		
		//elemento para finalizar o scanner
	sc.close();
	
	}

}
