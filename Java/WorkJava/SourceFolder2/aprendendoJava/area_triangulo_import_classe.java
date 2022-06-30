package aprendendoJava;
import java.util.Locale;
import java.util.Scanner;

import entidade.area_triangulo_classe;

public class area_triangulo_import_classe {

	public static void main(String[] args) {
		
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);

			area_triangulo_classe x, y;
			
			//******* x é uma instancia******
			//***area_triangulo_classe() é um método chamada apartir da instancia****
			//stack é a area onde sao criadas as variaveis estaticas
			//essas variaveis sao essas declaradas no programa
			//comando new faz uma alocação dinamica de memória
			//ou seja quando x = new area_triangulo_classe(); é instanciado ou criado um objeto area_triangulo_classe em uma outra area de memória
			//essa memória chama-se heap
			//memoria heap é onde sao criados objetos dinamicos
			//ou seja durante a execução do programa
			x = new area_triangulo_classe();
			
			
			
			//******* y também é uma instancia******
			//***area_triangulo_classe() é um método chamada apartir da instancia****
			//essa variavel x existe no stack, entretando no seu interior nao estao os dados do triangulo
			//essa variavel x no stack esta o endereço de memória do objeto criado no heap
			//ou seja a variael x é uma referencia para o objeto do heap
			
			y = new area_triangulo_classe();
			

			System.out.println("Medidas do Triângulo X: ");
			x.a = sc.nextDouble();
			x.b = sc.nextDouble();
			x.c = sc.nextDouble();

			System.out.println("Medidas do Triângulo Y: ");
			y.a = sc.nextDouble();
			y.b = sc.nextDouble();
			y.c = sc.nextDouble();

			double areax = x.area();
			

			double areay = y.area();
			

			System.out.printf("A área do Triangulo X é: %.4f%n", areax);
			System.out.printf("A área do Triangulo Y é: %.4f%n", areay);

			if (areax > areay) {
				System.out.println("A Maior área é o triangulo: X");
			} else {
				System.out.println("A Maior área é o triangulo: Y");
			}
			sc.close();
		}
	}