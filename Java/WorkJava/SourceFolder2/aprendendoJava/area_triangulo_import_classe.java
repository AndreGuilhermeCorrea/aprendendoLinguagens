package aprendendoJava;
import java.util.Locale;
import java.util.Scanner;

import entidade.area_triangulo_classe;

public class area_triangulo_import_classe {

	public static void main(String[] args) {
		
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);

			area_triangulo_classe x, y;
			
			//******* x � uma instancia******
			//***area_triangulo_classe() � um m�todo chamada apartir da instancia****
			//stack � a area onde sao criadas as variaveis estaticas
			//essas variaveis sao essas declaradas no programa
			//comando new faz uma aloca��o dinamica de mem�ria
			//ou seja quando x = new area_triangulo_classe(); � instanciado ou criado um objeto area_triangulo_classe em uma outra area de mem�ria
			//essa mem�ria chama-se heap
			//memoria heap � onde sao criados objetos dinamicos
			//ou seja durante a execu��o do programa
			x = new area_triangulo_classe();
			
			
			
			//******* y tamb�m � uma instancia******
			//***area_triangulo_classe() � um m�todo chamada apartir da instancia****
			//essa variavel x existe no stack, entretando no seu interior nao estao os dados do triangulo
			//essa variavel x no stack esta o endere�o de mem�ria do objeto criado no heap
			//ou seja a variael x � uma referencia para o objeto do heap
			
			y = new area_triangulo_classe();
			

			System.out.println("Medidas do Tri�ngulo X: ");
			x.a = sc.nextDouble();
			x.b = sc.nextDouble();
			x.c = sc.nextDouble();

			System.out.println("Medidas do Tri�ngulo Y: ");
			y.a = sc.nextDouble();
			y.b = sc.nextDouble();
			y.c = sc.nextDouble();

			double areax = x.area();
			

			double areay = y.area();
			

			System.out.printf("A �rea do Triangulo X �: %.4f%n", areax);
			System.out.printf("A �rea do Triangulo Y �: %.4f%n", areay);

			if (areax > areay) {
				System.out.println("A Maior �rea � o triangulo: X");
			} else {
				System.out.println("A Maior �rea � o triangulo: Y");
			}
			sc.close();
		}
	}