package entidade;
  
//classe criada normalmente

public class circulo_vs_2_classe {
	
	//*********OS MEMBROS NAO S�O ESTATICOS**********
	
	
	//** a palavra final declara que o valor � constante
		//� a declara��o da constante pi
		//** o padr�o de nomes para constantes s�o mai�sculas no caso de mais deuma palavra usa-se o (underline) ___ ***
		public final double PI = 3.14159;
		
		
		
		//M�TODOS N�O EST�TICOS,  OPERA��ES CHAMADAS APARTIR DO OBETO calcCirculo*******
		
		
		//fun��o circunferencia
		//***********N�O PODE-SE CHAMAR UM M�TODO QUE NAO SEJA EST�TICO EM UM M�TODO ESTATICO COMO O MAIN*********
		public double circunferenciaCirculo(double raioCirculo) {
			
			return 2.0 * PI * raioCirculo;
			
		}
		
		//fun��o volume
		//***********N�O PODE-SE CHAMAR UM M�TODO QUE NAO SEJA EST�TICO EM UM M�TODO ESTATICO COMO O MAIN*********
		public double volumeCircunferencia(double raioCirculo) {
			
			//n�o h� necessidade de colocar entre os parenteses por quest�o de prioridade
			return (4.0 * PI * raioCirculo * raioCirculo * raioCirculo) / 3.0;
			
			
		}

		

}
