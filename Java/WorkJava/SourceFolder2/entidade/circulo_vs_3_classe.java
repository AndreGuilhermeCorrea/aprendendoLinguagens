
package entidade;

//classe criada normalmente

public class circulo_vs_3_classe {

	// *********OS MEMBROS S�O ESTATICOS pois podem ser calculadas independente do
	// objeto**********
	// *********OS MEMBROS S�O ESTATICOS**********

	// ** a palavra final declara que o valor � constante
	// � a declara��o da constante pi
	// ** o padr�o de nomes para constantes s�o mai�sculas no caso de mais deuma
	// palavra usa-se o (underline) ___ ***
	public static final double PI = 3.14159;

	// *********OS MEMBROS S�O ESTATICOS pois podem ser calculadas independente do
	// objeto**********

	// ***assim sendo nao ha a necessidade de instanciar o objeto*****

	// OPERA��ES CHAMADAS APARTIR DO OBETO calcCirculo*******

	// fun��o circunferencia
	// ***********N�O PODE-SE CHAMAR UM M�TODO QUE NAO SEJA EST�TICO EM UM M�TODO
	// ESTATICO COMO O MAIN*********
	public static double circunferenciaCirculo3(double raioCirculo3) {

		return 2.0 * PI * raioCirculo3;

	}

	// fun��o volume
	// ***********N�O PODE-SE CHAMAR UM M�TODO QUE NAO SEJA EST�TICO EM UM M�TODO
	// ESTATICO COMO O MAIN*********
	public static double volumeCircunferencia3(double raioCirculo3) {

		// n�o h� necessidade de colocar entre os parenteses por quest�o de prioridade
		return (4.0 * PI * raioCirculo3 * raioCirculo3 * raioCirculo3) / 3.0;

	}

}
