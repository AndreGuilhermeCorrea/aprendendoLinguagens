
package entidade;

//classe criada normalmente

public class circulo_vs_3_classe {

	// *********OS MEMBROS SÃO ESTATICOS pois podem ser calculadas independente do
	// objeto**********
	// *********OS MEMBROS SÃO ESTATICOS**********

	// ** a palavra final declara que o valor é constante
	// é a declaração da constante pi
	// ** o padrão de nomes para constantes são maiúsculas no caso de mais deuma
	// palavra usa-se o (underline) ___ ***
	public static final double PI = 3.14159;

	// *********OS MEMBROS SÃO ESTATICOS pois podem ser calculadas independente do
	// objeto**********

	// ***assim sendo nao ha a necessidade de instanciar o objeto*****

	// OPERAÇÕES CHAMADAS APARTIR DO OBETO calcCirculo*******

	// função circunferencia
	// ***********NÃO PODE-SE CHAMAR UM MÉTODO QUE NAO SEJA ESTÁTICO EM UM MÉTODO
	// ESTATICO COMO O MAIN*********
	public static double circunferenciaCirculo3(double raioCirculo3) {

		return 2.0 * PI * raioCirculo3;

	}

	// função volume
	// ***********NÃO PODE-SE CHAMAR UM MÉTODO QUE NAO SEJA ESTÁTICO EM UM MÉTODO
	// ESTATICO COMO O MAIN*********
	public static double volumeCircunferencia3(double raioCirculo3) {

		// não há necessidade de colocar entre os parenteses por questão de prioridade
		return (4.0 * PI * raioCirculo3 * raioCirculo3 * raioCirculo3) / 3.0;

	}

}
