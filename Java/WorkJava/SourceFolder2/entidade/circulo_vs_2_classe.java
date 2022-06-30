package entidade;
  
//classe criada normalmente

public class circulo_vs_2_classe {
	
	//*********OS MEMBROS NAO SÃO ESTATICOS**********
	
	
	//** a palavra final declara que o valor é constante
		//é a declaração da constante pi
		//** o padrão de nomes para constantes são maiúsculas no caso de mais deuma palavra usa-se o (underline) ___ ***
		public final double PI = 3.14159;
		
		
		
		//MÉTODOS NÃO ESTÁTICOS,  OPERAÇÕES CHAMADAS APARTIR DO OBETO calcCirculo*******
		
		
		//função circunferencia
		//***********NÃO PODE-SE CHAMAR UM MÉTODO QUE NAO SEJA ESTÁTICO EM UM MÉTODO ESTATICO COMO O MAIN*********
		public double circunferenciaCirculo(double raioCirculo) {
			
			return 2.0 * PI * raioCirculo;
			
		}
		
		//função volume
		//***********NÃO PODE-SE CHAMAR UM MÉTODO QUE NAO SEJA ESTÁTICO EM UM MÉTODO ESTATICO COMO O MAIN*********
		public double volumeCircunferencia(double raioCirculo) {
			
			//não há necessidade de colocar entre os parenteses por questão de prioridade
			return (4.0 * PI * raioCirculo * raioCirculo * raioCirculo) / 3.0;
			
			
		}

		

}
